package com.tcf.mvit.bankingsystem;

public class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
        super(message);
    }
}
