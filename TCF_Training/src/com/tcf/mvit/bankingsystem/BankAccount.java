package com.tcf.mvit.bankingsystem;

public class BankAccount {
	 private String accountNumber;
	    private String holderName;
	    private double balance;
	    private static final double TRANSACTION_LIMIT = 50000.0;

	    public BankAccount(String accountNumber, String holderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) throws TransactionLimitExceededException {
	        if (amount > TRANSACTION_LIMIT) {
	            throw new TransactionLimitExceededException("Deposit exceeds limit: " + amount);
	        }
	        balance += amount;
	    }

	    public void withdraw(double amount) throws InsufficientFundsException, TransactionLimitExceededException {
	        if (amount > TRANSACTION_LIMIT) {
	            throw new TransactionLimitExceededException("Withdrawal exceeds limit: " + amount);
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient funds! Balance: " + balance);
	        }
	        balance -= amount;
	    }

	    public void transfer(BankAccount target, double amount)
	            throws InsufficientFundsException, TransactionLimitExceededException, InvalidAccountException {
	        if (target == null) {
	            throw new InvalidAccountException("Target account does not exist!");
	        }
	        this.withdraw(amount);
	        target.deposit(amount);
	    }

	    @Override
	    public String toString() {
	        return "Account[" + accountNumber + ", " + holderName + ", Balance=" + balance + "]";
	    }
}
