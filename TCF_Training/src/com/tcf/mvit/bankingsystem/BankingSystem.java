package com.tcf.mvit.bankingsystem;

public class BankingSystem {
	ublic static void main(String[] args) {
        BankAccount acc1 = new BankAccount("1001", "Alice", 60000);
        BankAccount acc2 = new BankAccount("1002", "Bob", 30000);

        TransactionService service = new TransactionService();

        // Deposit
        service.performDeposit(acc1, 40000);

        // Withdraw
        service.performWithdraw(acc1, 70000);  // should log error

        // Transfer
        service.performTransfer(acc1, acc2, 20000);

        // Invalid Transfer
        service.performTransfer(acc1, null, 5000); // should log error
    }
}
