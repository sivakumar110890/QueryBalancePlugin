package com.emagine.querybal.utils;

import static com.emagine.querybal.utils.QueryBalanceConstant.ACCOUNT_BALANCE;
import static com.emagine.querybal.utils.QueryBalanceConstant.AIRTIME_ADVANCE_BALANCE;
import static com.emagine.querybal.utils.QueryBalanceConstant.AIRTIME_ADVANCE_FLAG;
import static com.emagine.querybal.utils.QueryBalanceConstant.A_VALUE;
import static com.emagine.querybal.utils.QueryBalanceConstant.CELL_ID_KEY;
import static com.emagine.querybal.utils.QueryBalanceConstant.COMMENTS;
import static com.emagine.querybal.utils.QueryBalanceConstant.DATE_TIME;
import static com.emagine.querybal.utils.QueryBalanceConstant.DEST_ADDRESS;
import static com.emagine.querybal.utils.QueryBalanceConstant.LANG_CODE;
import static com.emagine.querybal.utils.QueryBalanceConstant.LOCATION_NUMBER_KEY;
import static com.emagine.querybal.utils.QueryBalanceConstant.MSISDN;
import static com.emagine.querybal.utils.QueryBalanceConstant.OFFER_REFRESH_FLAG;
import static com.emagine.querybal.utils.QueryBalanceConstant.POOL_ID;
import static com.emagine.querybal.utils.QueryBalanceConstant.PREF_PAY_METHOD;
import static com.emagine.querybal.utils.QueryBalanceConstant.PRODUCT_TYPE;
import static com.emagine.querybal.utils.QueryBalanceConstant.REFRESH_RF_VALUE;
import static com.emagine.querybal.utils.QueryBalanceConstant.RESULT_CODE;
import static com.emagine.querybal.utils.QueryBalanceConstant.SERIALNO_PREFIX;
import static com.emagine.querybal.utils.QueryBalanceConstant.STATUS;
import static com.emagine.querybal.utils.QueryBalanceConstant.TRANSACTION_ID;
import static com.emagine.querybal.utils.QueryBalanceConstant.USER_MSG_REF;
import static com.emagine.querybal.utils.QueryBalanceConstant.USER_SELECTION;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.emagine.querybal.config.PropertiesLoader;
import com.emagine.querybal.model.IncomingRequest;

public class Utils {
    private static final Logger LOGGER = Logger.getLogger(Utils.class);

    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.trim().equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNullOrEmpty(Long val) {
        if (val != null && val > 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Creates a serialNo for the OCS call. The format is:<br>
     * [511<11-char long uuid>]
     * 
     * @return
     * @throws Exception
     */
    public static String getSerialNumber() throws Exception {
        String uuid = UUID.uuid(11);
        return SERIALNO_PREFIX + uuid;
    }

    public static boolean isNumeric(String str) {
        try {
            Long.parseLong(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    /**
     * Returns the current {@link #java.util.Date}.
     * 
     * @return
     * @throws Exception
     */
    public Date getCurrentTimeStamp() throws Exception {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(PropertiesLoader.getValue(QueryBalanceConstant.AUDIT_TIMEZONE)));
        cal.add(Calendar.MILLISECOND, cal.get(Calendar.ZONE_OFFSET));
        return cal.getTime();
    }

    public static String convertToDBComment(String comments) {
        if (null != comments) {
            if (comments.contains("'")) {
                comments = comments.replace("'", "");
            }

            if (comments.length() > 250) {
                comments = comments.substring(0, 249);
            }
        }
        return comments;
    }

    public JSONObject generateMpesaJsonFromResponse(IncomingRequest request, String status, String comments, String resultCode, long accountBal) throws Exception {
        JSONObject responseJson = request.getMpesaJson();
        responseJson.put(STATUS, status);
        responseJson.put(COMMENTS, comments);
        responseJson.put(DATE_TIME, getCurrentTimeStamp());
        responseJson.put(RESULT_CODE, resultCode);
        responseJson.put(ACCOUNT_BALANCE, accountBal);
        LOGGER.debug("method generateMpesaJsonFromResponse => responseJson" + responseJson);
        return responseJson;
    }

    public JSONObject generateJsonFromResponse(IncomingRequest request, String status, String comments, String resultCode, long accountBal, long airtimeAdvanceBal) throws Exception {
        LOGGER.debug("method generateJsonFromResponse => ");
        JSONObject responseJson = new JSONObject();
        responseJson.put(MSISDN, request.getMsisdn());
        responseJson.put(TRANSACTION_ID, request.getTransactionId());
        responseJson.put(STATUS, status);
        responseJson.put(COMMENTS, comments);
        responseJson.put(DATE_TIME, getCurrentTimeStamp());
        responseJson.put(RESULT_CODE, resultCode);
        responseJson.put(ACCOUNT_BALANCE, accountBal);
        if (request.getAirtimeAdvanceFlag() == 1) {
            responseJson.put(AIRTIME_ADVANCE_BALANCE, airtimeAdvanceBal);
            responseJson.put(AIRTIME_ADVANCE_FLAG, request.getAirtimeAdvanceFlag());
        }
        if (request.getRefreshRfFlag() == 1) {
            responseJson.put(REFRESH_RF_VALUE, request.getRefreshRfFlag());
            responseJson.put(PREF_PAY_METHOD, request.getPrefPayMethod());
            responseJson.put(A_VALUE, Float.toString(request.getaValue()));
        } else {
            responseJson.put(REFRESH_RF_VALUE, 0);
        }
        if (null != request.getCellId()) {
            responseJson.put(CELL_ID_KEY, request.getCellId());
        }
        if (null != request.getLocationNumber()) {
            responseJson.put(LOCATION_NUMBER_KEY, request.getLocationNumber());
        }
        if (null != request.getPoolId()) {
            responseJson.put(POOL_ID, request.getPoolId());
        }

        responseJson.put(USER_MSG_REF, request.getUserMsgRef());
        responseJson.put(PRODUCT_TYPE, request.getProdType());
        responseJson.put(DEST_ADDRESS, request.getDestAddress());
        responseJson.put(LANG_CODE, request.getLangCode());
        responseJson.put(USER_SELECTION, request.getUserSelection());
        responseJson.put(OFFER_REFRESH_FLAG, request.getOfferRefreshFlag());

        LOGGER.debug("method generateJsonFromResponse => responseJson" + responseJson);
        return responseJson;
    }
}
