package com.emagine.querybal.model;

import org.json.JSONObject;

public class IncomingRequest {

    private String msisdn;
    private String transactionId;
    private String subscriberId;
    private long userMsgRef;
    private String prodType;
    private String destAddress;
    private int langCode;
    private String userSelection;
    private String offerRefreshFlag;
    private boolean isMpesa;
    private JSONObject mpesaJson;
    private int airtimeAdvanceFlag;
    private int refreshRfFlag;
    private String prefPayMethod;
    private float aValue;
    private String cellId;
    private long locationNumber;
    private String poolId;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public long getUserMsgRef() {
        return userMsgRef;
    }

    public void setUserMsgRef(long userMsgRef) {
        this.userMsgRef = userMsgRef;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getDestAddress() {
        return destAddress;
    }

    public void setDestAddress(String destAddress) {
        this.destAddress = destAddress;
    }

    public int getLangCode() {
        return langCode;
    }

    public void setLangCode(int langCode) {
        this.langCode = langCode;
    }

    public String getUserSelection() {
        return userSelection;
    }

    public void setUserSelection(String userSelection) {
        this.userSelection = userSelection;
    }

    public String getOfferRefreshFlag() {
        return offerRefreshFlag;
    }

    public void setOfferRefreshFlag(String offerRefreshFlag) {
        this.offerRefreshFlag = offerRefreshFlag;
    }

    public boolean isMpesa() {
        return isMpesa;
    }

    public void setMpesa(boolean isMpesa) {
        this.isMpesa = isMpesa;
    }

    public JSONObject getMpesaJson() {
        return mpesaJson;
    }

    public void setMpesaJson(JSONObject mpesaJson) {
        this.mpesaJson = mpesaJson;
    }

    public int getAirtimeAdvanceFlag() {
        return airtimeAdvanceFlag;
    }

    public void setAirtimeAdvanceFlag(int airtimeAdvanceFlag) {
        this.airtimeAdvanceFlag = airtimeAdvanceFlag;
    }

    public int getRefreshRfFlag() {
        return refreshRfFlag;
    }

    public void setRefreshRfFlag(int refreshRfFlag) {
        this.refreshRfFlag = refreshRfFlag;
    }

    public String getPrefPayMethod() {
        return prefPayMethod;
    }

    public void setPrefPayMethod(String prefPayMethod) {
        this.prefPayMethod = prefPayMethod;
    }

    public float getaValue() {
        return aValue;
    }

    public void setaValue(float aValue) {
        this.aValue = aValue;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public Long getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(long locationNumber) {
        this.locationNumber = locationNumber;
    }

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

}
