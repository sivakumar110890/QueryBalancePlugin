/**
 * 
 */
package com.emagine.querybal.utils;

/**
 *
 */
public class QueryBalanceInputException extends Exception {

	private static final long serialVersionUID = 1L;

	private int errorCode;

	public QueryBalanceInputException() {
	}

	public QueryBalanceInputException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public QueryBalanceInputException(int errorCode, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode
	 *            the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
}
