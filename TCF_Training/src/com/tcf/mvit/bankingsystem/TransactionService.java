package com.tcf.mvit.bankingsystem;

public class TransactionService {
	public void performDeposit(BankAccount account, double amount) {
        try {
            account.deposit(amount);
            System.out.println("Deposit Successful! New Balance: " + account.getBalance());
        } catch (TransactionLimitExceededException e) {
            ErrorLogger.logError(e.getMessage());
        }
    }

    public void performWithdraw(BankAccount account, double amount) {
        try {
            account.withdraw(amount);
            System.out.println("Withdrawal Successful! New Balance: " + account.getBalance());
        } catch (InsufficientFundsException | TransactionLimitExceededException e) {
            ErrorLogger.logError(e.getMessage());
        }
    }

    public void performTransfer(BankAccount from, BankAccount to, double amount) {
        try {
            from.transfer(to, amount);
            System.out.println("Transfer Successful!");
            System.out.println("From Account Balance: " + from.getBalance());
            System.out.println("To Account Balance: " + to.getBalance());
        } catch (InsufficientFundsException | TransactionLimitExceededException | InvalidAccountException e) {
            ErrorLogger.logError(e.getMessage());
        }
    }
}
