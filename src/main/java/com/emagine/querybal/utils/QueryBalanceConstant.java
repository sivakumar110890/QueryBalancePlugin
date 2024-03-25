package com.emagine.querybal.utils;

public class QueryBalanceConstant {

    public static final String userDir = System.getProperty("user.dir");

    public static String QUERY_MGR_CONSUMER_TOPIC = "querymgr.consumer.topic";
    public static String AUDIT_TIMEZONE = "audit.timzone";

    public static final String OCS_QRY_MGR_WSDL_LOC = "ocs.qry.mgr.wsdl.location";
    public static final String OCS_AA_WSDL_LOC = "ocs.aa.wsdl.location";

    public final static String STATUS_OCS_SUCCESS = "OCS_SUCCESS";
    public final static String STATUS_OCS_FAILURE = "OCS_FAILURE";
    public final static String STATUS_RCVD = "REQUEST_RECEIVED";
    public final static String STATUS_OCS_TIMEOUT = "TIMEOUT";
    public final static String STATUS_EXCEPTION = "EXCEPTION";
    public final static String STATUS_FAILURE = "FAILURE";

    public final static String COMMENTS = "COMMENTS";

    public final static String MSISDN = "MSISDN";
    public final static String TRANSACTION_ID = "TRANSACTION_ID";
    public final static String STATUS = "STATUS";
    public final static String DATE_TIME = "DATE_TIME";
    public final static String RESULT_CODE = "RESULT_CODE";
    public final static String ACCOUNT_BALANCE = "ACCOUNT_BALANCE";
    public final static String USER_MSG_REF = "USER_MSG_REF";
    public static final String PRODUCT_TYPE = "PRODUCT_TYPE";
    public static final String DEST_ADDRESS = "DEST_ADDRESS";
    public static final String LANG_CODE = "LANG_CODE";
    public static final String USER_SELECTION = "USER_SELECTION";
    public static final String SHORT_MSG = "SHORT_MSG";
    public static final String OFFER_REFRESH_FLAG = "OFFER_REFRESH_FLAG";
    public static final String AIRTIME_ADVANCE_FLAG = "AA_ELIGIBLE";
    public final static String AIRTIME_ADVANCE_BALANCE = "AIRTIME_ADVANCE_BALANCE";
    public final static String REFRESH_RF_VALUE = "REFRESH_RF_VALUE";
    public static final String PREF_PAY_METHOD = "PREF_PAY_METHOD";
    public static final String A_VALUE = "A_VALUE";

    public static final String XML_LOAN_AMOUNT_TAG_NAME = "loan.amount.tag.name";
    public static final String XML_MAX_LOAN_TAG_NAME = "max.loan.tag.name";
    public static final String CURRENCY_MULTIPLIER_1 = "currency.multiplier.1";

    public static final String SERIALNO_PREFIX = "511";
    public static final String REWARDS_OCS_REQTYPE = "Event";
    public static final String REWARDS_OCS_CMDID = "ChangeOptionalOffer";

    // procedure
    public static final String REWARD_LOG_PROC_NAME = "rewards.log.procName";

    // Error codes messages related
    public static final String INPUT_MSISDN_INVALID_CD = "input.msisdn.invalid.code";
    public static final String INPUT_MSISDN_INVALID_MSG = "input.msisdn.invalid.msg";
    public static final String INPUT_MSG_INVALID_CD = "input.messgae.invalid.code";
    public static final String INPUT_MSG_INVALID_MSG = "input.messgae.invalid.msg";

    public static final String OCS_SOCKET_TIMEOUT_CD = "ocs.socket.timeout.code";
    public static final String OCS_SOCKET_TIMEOUT_MSG = "ocs.socket.timeout.msg";
    public static final String OCS_CONN_FAILED_CD = "ocs.connection.failed.code";
    public static final String OCS_CONN_FAILED_MSG = "ocs.connection.failed.msg";

    // Retries and timeout related
    public static final String NUM_RETRIES = "ocs.retry.numRetries";
    public static final String TIME_TO_WAIT = "ocs.retry.timeToWait";
    public static final String CONN_TIMEOUT_MILLIS = "ocs.connection.timeoutMillis";
    public static final String REQ_TIMEOUT_MILLIS = "ocs.request.timeoutMillis";
    public static final String AA_CONN_TIMEOUT_MILLIS = "ocs.aa.connection.timeoutMillis";
    public static final String AA_READ_TIMEOUT_MILLIS = "ocs.aa.read.timeoutMillis";

    // Query balance OCS Request message input values
    public static final String OCS_OPERATION_TYPE = "ocs.qry.operationType";
    public static final String OCS_VERSION = "ocs.qry.ver";
    public static final String OCS_SEQ_ID = "ocs.qry.seqId";
    public static final String OCS_REQ_TYPE = "ocs.qry.reqType";
    public static final String OCS_QRY_CMD_ID = "ocs.qry.commandId";

    public static final String OCS_ACC_TYPE_LIST = "ocs.qry.bal.account.type.list";

    public static final String OCS_SUCCESS_CODE_PREFIX = "4050";

    public static final String SUBID_LENGTH = "ocs.subscriberId.length";
    public static final String SUBID_CNTRYCD = "ocs.subscriberId.countryCode";

    // Rewards Kafka topic
    public static final String USSD_TOPIC = "ussd.topic";
    public static final String MPESA_TOPIC = "mpesa.topic";
    public static final String QUERY_BAL_TX_TOPIC = "querybal.tx.topic";

    public static final String SOURCE = "SOURCE";
    public static final String MPESA_QUARY_BAL = "MPESA_QUARY_BAL";

    public static final String CELL_ID_KEY = "CELL_ID";

    public static final String LOCATION_NUMBER_KEY = "LOCATION_NUMBER";
    public static final String POOL_ID = "POOL_ID";

}
