package com.tcf.mvit.Assignment.bankingsystem;

public class TransactionLimitExceededException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TransactionLimitExceededException(String message) {
        super(message);
    }
}
