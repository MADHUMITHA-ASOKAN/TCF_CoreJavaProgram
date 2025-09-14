package com.tcf.mvit.bankingsystem;

public class InvalidAccountException extends Exception {
	public InsufficientFundsException(String message) {
        super(message);
    }
}
