package com.emagine.querybal.model;

/**
 * DTO for OCS web service call response.
 */
public class OCSResponse {

    private String resultCode;
    private String msg;
    private String status;
    private long accountBalance;
    private long airtimeAdvance;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String errorCode) {
        this.resultCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public long getAirtimeAdvance() {
        return airtimeAdvance;
    }

    public void setAirtimeAdvance(long airtimeAdvance) {
        this.airtimeAdvance = airtimeAdvance;
    }

    @Override
    public String toString() {
        return "OCSResponse [resultCode=" + resultCode + ", msg=" + msg + ", status=" + status + ", accountBalance=" + accountBalance + ", airtimeAdvance=" + airtimeAdvance + "]";
    }

}
