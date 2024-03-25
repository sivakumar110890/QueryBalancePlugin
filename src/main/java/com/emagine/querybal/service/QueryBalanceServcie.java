package com.emagine.querybal.service;

import static com.emagine.querybal.utils.QueryBalanceConstant.AIRTIME_ADVANCE_FLAG;
import static com.emagine.querybal.utils.QueryBalanceConstant.A_VALUE;
import static com.emagine.querybal.utils.QueryBalanceConstant.CELL_ID_KEY;
import static com.emagine.querybal.utils.QueryBalanceConstant.DEST_ADDRESS;
import static com.emagine.querybal.utils.QueryBalanceConstant.INPUT_MSG_INVALID_CD;
import static com.emagine.querybal.utils.QueryBalanceConstant.INPUT_MSG_INVALID_MSG;
import static com.emagine.querybal.utils.QueryBalanceConstant.INPUT_MSISDN_INVALID_CD;
import static com.emagine.querybal.utils.QueryBalanceConstant.INPUT_MSISDN_INVALID_MSG;
import static com.emagine.querybal.utils.QueryBalanceConstant.LANG_CODE;
import static com.emagine.querybal.utils.QueryBalanceConstant.LOCATION_NUMBER_KEY;
import static com.emagine.querybal.utils.QueryBalanceConstant.MPESA_QUARY_BAL;
import static com.emagine.querybal.utils.QueryBalanceConstant.MPESA_TOPIC;
import static com.emagine.querybal.utils.QueryBalanceConstant.MSISDN;
import static com.emagine.querybal.utils.QueryBalanceConstant.OFFER_REFRESH_FLAG;
import static com.emagine.querybal.utils.QueryBalanceConstant.POOL_ID;
import static com.emagine.querybal.utils.QueryBalanceConstant.PREF_PAY_METHOD;
import static com.emagine.querybal.utils.QueryBalanceConstant.PRODUCT_TYPE;
import static com.emagine.querybal.utils.QueryBalanceConstant.QUERY_BAL_TX_TOPIC;
import static com.emagine.querybal.utils.QueryBalanceConstant.REFRESH_RF_VALUE;
import static com.emagine.querybal.utils.QueryBalanceConstant.SHORT_MSG;
import static com.emagine.querybal.utils.QueryBalanceConstant.SOURCE;
import static com.emagine.querybal.utils.QueryBalanceConstant.STATUS_FAILURE;
import static com.emagine.querybal.utils.QueryBalanceConstant.SUBID_CNTRYCD;
import static com.emagine.querybal.utils.QueryBalanceConstant.SUBID_LENGTH;
import static com.emagine.querybal.utils.QueryBalanceConstant.TRANSACTION_ID;
import static com.emagine.querybal.utils.QueryBalanceConstant.USER_MSG_REF;
import static com.emagine.querybal.utils.QueryBalanceConstant.USSD_TOPIC;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import com.emagine.querybal.config.PropertiesLoader;
import com.emagine.querybal.model.IncomingRequest;
import com.emagine.querybal.model.OCSResponse;
import com.emagine.querybal.service.publisher.QueryBalancePublisher;
import com.emagine.querybal.utils.QueryBalanceInputException;
import com.emagine.querybal.utils.Utils;

public class QueryBalanceServcie implements IQueryBalanceService {

    private static final Logger LOGGER = Logger.getLogger(QueryBalanceServcie.class);
    private Utils utils;
    private QueryBalancePublisher publisher;

    public QueryBalanceServcie() throws Exception {
        utils = new Utils();
        publisher = new QueryBalancePublisher();
    }

    @Override
    public void processQueryBalanceRequest(String message) throws Exception {
        IncomingRequest request = new IncomingRequest();
        try {
            parseIncomingRequest(message, request);
        } catch (Exception e) {
            if (e instanceof QueryBalanceInputException) {
                QueryBalanceInputException re = (QueryBalanceInputException) e;
                if (re.getErrorCode() != PropertiesLoader.getIntValue(INPUT_MSG_INVALID_CD)) {
                    JSONObject txLogJson = utils.generateJsonFromResponse(request, STATUS_FAILURE, re.getErrorCode() + ": " + re.getMessage(), null, 0, 0);
                    publisher.addEvent(PropertiesLoader.getValue(QUERY_BAL_TX_TOPIC), txLogJson.toString());
                }
            }
            LOGGER.error("Failed to parse the request message :: " + e.getMessage(), e);
            throw e;
        }
        if (null != request) {

            JSONObject resJson = executeQueryBalanceRequest(request);
            LOGGER.debug("processQueryBalanceRequest method :: responseJson = " + resJson);

            // Send the status response to kafka
            if (request.isMpesa()) {
                publisher.addEvent(PropertiesLoader.getValue(MPESA_TOPIC), resJson.toString());
            } else {
                publisher.addEvent(PropertiesLoader.getValue(USSD_TOPIC), resJson.toString());
            }
        }
    }

    private void parseIncomingRequest(String message, IncomingRequest request) throws Exception {
        try {
            JSONObject jsonRequest = new JSONObject(message);

            String msisdn = jsonRequest.get(MSISDN).toString();
            if (msisdn != null && msisdn.length() == PropertiesLoader.getIntValue(SUBID_LENGTH)) {
                request.setSubscriberId(msisdn.replaceFirst(PropertiesLoader.getValue(SUBID_CNTRYCD), ""));
            } else {
                request.setSubscriberId(msisdn);
            }

            request.setMsisdn(msisdn);

            if (checkSourceMpesa(jsonRequest)) {
                request.setMpesa(true);
                request.setMpesaJson(jsonRequest);
            } else {
                request.setMpesa(false);
                request.setTransactionId(jsonRequest.getString(TRANSACTION_ID));
                request.setUserMsgRef(jsonRequest.getLong(USER_MSG_REF));
                request.setProdType(jsonRequest.getString(PRODUCT_TYPE));
                request.setLangCode(jsonRequest.getInt(LANG_CODE));
                request.setDestAddress(jsonRequest.getString(DEST_ADDRESS));
                request.setUserSelection(jsonRequest.getString(SHORT_MSG));
                request.setOfferRefreshFlag(jsonRequest.getString(OFFER_REFRESH_FLAG));
                request.setAirtimeAdvanceFlag(jsonRequest.has(AIRTIME_ADVANCE_FLAG) ? jsonRequest.getInt(AIRTIME_ADVANCE_FLAG) : 0);
                request.setRefreshRfFlag(jsonRequest.has(REFRESH_RF_VALUE) ? jsonRequest.getInt(REFRESH_RF_VALUE) : 0);
                request.setPrefPayMethod(jsonRequest.getString(PREF_PAY_METHOD));
                request.setaValue(Float.parseFloat(jsonRequest.getString(A_VALUE)));
                request.setCellId(jsonRequest.getString(CELL_ID_KEY));
                request.setLocationNumber(jsonRequest.getLong(LOCATION_NUMBER_KEY));
                request.setPoolId(jsonRequest.getString(POOL_ID));

                validateQueryBalanceRequest(request);
            }
        } catch (JSONException je) {
            int errorCode = PropertiesLoader.getIntValue(INPUT_MSG_INVALID_CD);
            String errorMsg = PropertiesLoader.getValue(INPUT_MSG_INVALID_MSG) + je.getMessage();
            throw new QueryBalanceInputException(errorCode, errorMsg, je);
        }
    }

    /**
     * @param jsonRequest
     * @return
     * @throws JSONException
     */
    private boolean checkSourceMpesa(JSONObject jsonRequest) throws JSONException {
        return jsonRequest.has(SOURCE) && jsonRequest.getString(SOURCE).equalsIgnoreCase(MPESA_QUARY_BAL) ? true : false;
    }

    private void validateQueryBalanceRequest(IncomingRequest request) throws Exception {
        String errorMsg = "";
        int errorCode = 0;
        if (Utils.isNullOrEmpty(request.getMsisdn()) || request.getMsisdn().length() < 9) {
            errorCode = PropertiesLoader.getIntValue(INPUT_MSISDN_INVALID_CD);
            errorMsg = PropertiesLoader.getValue(INPUT_MSISDN_INVALID_MSG);
        }
        if (errorCode != 0) {
            throw new QueryBalanceInputException(errorCode, errorMsg);
        }
    }

    private JSONObject executeQueryBalanceRequest(IncomingRequest request) throws Exception {
        LOGGER.debug("executing QueryBalanceRequest for the Msisdn = " + request.getMsisdn());
        String status = null;
        String comments = null;
        String resultCode = null;
        long accountBal = 0;
        long airtimeAdvanceBal = 0;
        JSONObject responseJson = null;
        OCSResponse ocsResponse;
        try {
            LOGGER.debug("QueryMgrClient => ");
            QueryMgrClient queryMgrClient = new QueryMgrClient();
            ocsResponse = queryMgrClient.getAccountBalance(request);
            status = ocsResponse.getStatus();
            comments = ocsResponse.getResultCode() + ": " + ocsResponse.getMsg();
            resultCode = ocsResponse.getResultCode();
            accountBal = ocsResponse.getAccountBalance();
            airtimeAdvanceBal = ocsResponse.getAirtimeAdvance();
            LOGGER.debug("QueryMgrClient => res " + ocsResponse);

        } catch (Exception ex) {
            LOGGER.error("Processing of executeQueryBalanceRequest failed:: " + ex.getMessage(), ex);
            status = STATUS_FAILURE;
            comments = ex.getMessage();
        } finally {
            // LOGGER.debug(" finally ocsResponse" + ocsResponse);
            if (request.isMpesa()) {
                LOGGER.debug("Generating mpesa json for publishing");
                responseJson = utils.generateMpesaJsonFromResponse(request, status, comments, resultCode, accountBal);
            } else {
                LOGGER.debug("Generating json for publishing");

                LOGGER.debug("Actual account balance - " + accountBal);
                // accountBal = 25000;
                // LOGGER.debug("HARD CODED account balance - " + accountBal);
                responseJson = utils.generateJsonFromResponse(request, status, comments, resultCode, accountBal, airtimeAdvanceBal);
            }
        }

        return responseJson;
    }

}
