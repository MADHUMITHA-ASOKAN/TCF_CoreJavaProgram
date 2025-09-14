package com.tcf.mvit.Assignment.bankingsystem;

public class InvalidAccountException extends Exception {
	public InsufficientFundsException(String message) {
        super(message);
    }
}
