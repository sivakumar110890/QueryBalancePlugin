package com.emagine.querybal.service;

import static com.emagine.querybal.utils.QueryBalanceConstant.CONN_TIMEOUT_MILLIS;
import static com.emagine.querybal.utils.QueryBalanceConstant.NUM_RETRIES;
import static com.emagine.querybal.utils.QueryBalanceConstant.OCS_ACC_TYPE_LIST;
import static com.emagine.querybal.utils.QueryBalanceConstant.OCS_CONN_FAILED_CD;
import static com.emagine.querybal.utils.QueryBalanceConstant.OCS_CONN_FAILED_MSG;
import static com.emagine.querybal.utils.QueryBalanceConstant.OCS_QRY_CMD_ID;
import static com.emagine.querybal.utils.QueryBalanceConstant.OCS_REQ_TYPE;
import static com.emagine.querybal.utils.QueryBalanceConstant.OCS_SEQ_ID;
import static com.emagine.querybal.utils.QueryBalanceConstant.OCS_SOCKET_TIMEOUT_CD;
import static com.emagine.querybal.utils.QueryBalanceConstant.OCS_SOCKET_TIMEOUT_MSG;
import static com.emagine.querybal.utils.QueryBalanceConstant.OCS_SUCCESS_CODE_PREFIX;
import static com.emagine.querybal.utils.QueryBalanceConstant.OCS_VERSION;
import static com.emagine.querybal.utils.QueryBalanceConstant.REQ_TIMEOUT_MILLIS;
import static com.emagine.querybal.utils.QueryBalanceConstant.STATUS_EXCEPTION;
import static com.emagine.querybal.utils.QueryBalanceConstant.STATUS_OCS_FAILURE;
import static com.emagine.querybal.utils.QueryBalanceConstant.STATUS_OCS_SUCCESS;
import static com.emagine.querybal.utils.QueryBalanceConstant.STATUS_OCS_TIMEOUT;
import static com.emagine.querybal.utils.QueryBalanceConstant.TIME_TO_WAIT;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.apache.log4j.Logger;

import com.emagine.querybal.config.PropertiesLoader;
import com.emagine.querybal.model.IncomingRequest;
import com.emagine.querybal.model.OCSResponse;
import com.emagine.querybal.utils.Utils;
import com.huawei.bme.cbsinterface.common.RequestHeader;
import com.huawei.bme.cbsinterface.common.ResultHeader;
import com.huawei.bme.cbsinterface.query.BalanceType;
import com.huawei.bme.cbsinterface.query.QueryBalanceRequest;
import com.huawei.bme.cbsinterface.query.QueryBalanceResult;
import com.huawei.bme.cbsinterface.querymgr.QueryBalanceRequestMsg;
import com.huawei.bme.cbsinterface.querymgr.QueryBalanceResultMsg;
import com.huawei.bme.cbsinterface.querymgr.QueryMgr;
import com.huawei.bme.cbsinterface.querymgr.QueryMgrService;

public class QueryMgrClient {

    private static final Logger LOGGER = Logger.getLogger(QueryMgrClient.class);
    private static QueryMgrService service = new QueryMgrService();
    private static QueryMgr port = service.getQueryMgrServicePort();
    private static int numRetries;
    private static int waitMillis;
    private static int connTimeoutMillis;
    private static int reqTimeoutMillis;
    private static List<String> accTypeList;

    static {
        LOGGER.debug("static block PropertiesLoader started" + port);
        try {
            numRetries = PropertiesLoader.getIntValue(NUM_RETRIES);
            waitMillis = PropertiesLoader.getIntValue(TIME_TO_WAIT);
            connTimeoutMillis = PropertiesLoader.getIntValue(CONN_TIMEOUT_MILLIS);
            reqTimeoutMillis = PropertiesLoader.getIntValue(REQ_TIMEOUT_MILLIS);
            ((BindingProvider) port).getRequestContext().put("com.sun.xml.internal.ws.connect.timeout", connTimeoutMillis);
            ((BindingProvider) port).getRequestContext().put("com.sun.xml.internal.ws.request.timeout", reqTimeoutMillis);
            accTypeList = new ArrayList<String>();
            accTypeList = Arrays.asList(PropertiesLoader.getValue(OCS_ACC_TYPE_LIST).split(","));
        } catch (Exception ex) {
            LOGGER.error("static block PropertiesLoader errror", ex);
        }
    }

    public OCSResponse getAccountBalance(IncomingRequest incomingRequest) throws Exception {

        LOGGER.debug("method getAccountBalance = " + incomingRequest.toString());
        OCSResponse ocsResponse = null;
        ResultHeader resultHeader;
        AirtimeAdvanceClient airtimeAdvanceClient = new AirtimeAdvanceClient();
        QueryBalanceRequestMsg queryBalanceRequestMsg = new QueryBalanceRequestMsg();
        populateQueryBalReqMsg(queryBalanceRequestMsg, incomingRequest);

        for (int i = 0; i < numRetries; i++) {
            LOGGER.debug("numRetries = " + numRetries);
            try {
                QueryBalanceResultMsg queryBalanceResultMsg = port.queryBalance(queryBalanceRequestMsg);
                if (null != queryBalanceResultMsg && null != queryBalanceResultMsg.getResultHeader()) {
                    ocsResponse = new OCSResponse();
                    resultHeader = queryBalanceResultMsg.getResultHeader();
                    if (null != resultHeader.getResultCode() && resultHeader.getResultCode().startsWith(OCS_SUCCESS_CODE_PREFIX)) {
                        ocsResponse.setStatus(STATUS_OCS_SUCCESS);
                        QueryBalanceResult queryBalanceResult = queryBalanceResultMsg.getQueryBalanceResult();

                        List<BalanceType> balanceTypeList = queryBalanceResult.getBalanceRecord();
                        long accountBalance = 0;
                        for (BalanceType balanceType : balanceTypeList) {
                            if (accTypeList.contains(balanceType.getAccountType())) {
                                LOGGER.debug("AccountType = " + balanceType.getAccountType() + " :: accountBalance = " + balanceType.getAmount());
                                accountBalance = accountBalance + balanceType.getAmount();
                            }
                        }

                        LOGGER.debug("accountBalance = " + accountBalance);
                        ocsResponse.setAccountBalance(accountBalance);
                        if (incomingRequest.getAirtimeAdvanceFlag() == 1) {
                            AirtimeAdvanceClient.loadReqestXml();
                            ocsResponse.setAirtimeAdvance(airtimeAdvanceClient.callAirtimeAdvanceService(incomingRequest));
                        }
                    } else {
                        ocsResponse.setStatus(STATUS_OCS_FAILURE);
                    }

                    ocsResponse.setMsg(resultHeader.getResultDesc().getValue());
                    ocsResponse.setResultCode(resultHeader.getResultCode());
                } else {
                    LOGGER.error("Invalid response received from OCS");
                }
                LOGGER.debug("executeQueryBalanceRequest processed successfully");
                break;
            } catch (WebServiceException we) {
                Throwable rootCause = we.getCause();
                if (null != rootCause && rootCause instanceof java.net.SocketTimeoutException) {
                    ocsResponse = new OCSResponse();
                    ocsResponse.setResultCode(PropertiesLoader.getValue(OCS_SOCKET_TIMEOUT_CD));
                    ocsResponse.setMsg(PropertiesLoader.getValue(OCS_SOCKET_TIMEOUT_MSG));
                    ocsResponse.setStatus(STATUS_OCS_TIMEOUT);
                    LOGGER.error("Timeout occured in getAccountBalance method call: " + we.getMessage(), we);
                    break;
                } else if (null != rootCause && rootCause instanceof java.net.ConnectException || rootCause instanceof FileNotFoundException) {
                    try {
                        Thread.sleep(waitMillis);
                    } catch (InterruptedException ie) {
                        LOGGER.error(ie.getMessage(), ie);
                    }
                    LOGGER.error("Connection error occured in getAccountBalance method call: " + we.getMessage(), we);
                } else {
                    LOGGER.error("Unknown error occured in getAccountBalance method call: " + we.getMessage(), we);
                }
            } catch (Exception ex) {
                LOGGER.error("Unknown error occured in getAccountBalance method call: " + ex.getMessage(), ex);

            }
        }

        if (null == ocsResponse) {
            ocsResponse = new OCSResponse();
            ocsResponse.setResultCode(PropertiesLoader.getValue(OCS_CONN_FAILED_CD));
            ocsResponse.setMsg(PropertiesLoader.getValue(OCS_CONN_FAILED_MSG));
            ocsResponse.setStatus(STATUS_EXCEPTION);
        }
        LOGGER.debug("method getAccountBalance end = ocsResponse" + ocsResponse);

        return ocsResponse;
    }

    private void populateQueryBalReqMsg(QueryBalanceRequestMsg queryBalanceRequestMsg, IncomingRequest incomingRequest) throws Exception {

        RequestHeader requestHeader = new RequestHeader();
        QueryBalanceRequest queryBalanceRequest = new QueryBalanceRequest();

        // populate Request Header
        populateRequestHeader(requestHeader);

        // populate Query Balance Request
        populateQueryBalanceReq(queryBalanceRequest, incomingRequest);

        queryBalanceRequestMsg.setRequestHeader(requestHeader);
        queryBalanceRequestMsg.setQueryBalanceRequest(queryBalanceRequest);
    }

    /*
     * <QueryBalanceRequest> <quer1:SubscriberNo>826120011</quer1:SubscriberNo>
     * </QueryBalanceRequest>
     */
    private void populateQueryBalanceReq(QueryBalanceRequest queryBalanceRequest, IncomingRequest incomingRequest) throws Exception {
        queryBalanceRequest.setSubscriberNo(incomingRequest.getSubscriberId());
    }

    /*
     * <RequestHeader> <com:CommandId>QueryBalance</com:CommandId>
     * <com:Version>1</com:Version> <com:TransactionId>1</com:TransactionId>
     * <com:SequenceId>1</com:SequenceId>
     * <com:RequestType>Event</com:RequestType>
     * <com:SerialNo>1241332e25</com:SerialNo> </RequestHeader>
     */

    private void populateRequestHeader(RequestHeader requestHeader) throws Exception {
        requestHeader.setTransactionId("");
        requestHeader.setCommandId(PropertiesLoader.getValue(OCS_QRY_CMD_ID));
        requestHeader.setVersion(PropertiesLoader.getValue(OCS_VERSION));
        requestHeader.setSequenceId(PropertiesLoader.getValue(OCS_SEQ_ID));
        requestHeader.setRequestType(PropertiesLoader.getValue(OCS_REQ_TYPE));
        String serialNo = Utils.getSerialNumber();
        requestHeader.setSerialNo(serialNo);

    }
}
