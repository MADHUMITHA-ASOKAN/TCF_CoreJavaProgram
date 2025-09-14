package com.tcf.mvit.Assignment.bankingsystem;

public class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
        super(message);
    }
}
