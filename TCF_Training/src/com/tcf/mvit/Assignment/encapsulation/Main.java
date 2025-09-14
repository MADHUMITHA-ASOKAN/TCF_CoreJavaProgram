package com.tcf.mvit.Assignment.encapsulation;

public class Main {
	public static void main(String[] args) {
        // Create an account
        BankAccount account = new BankAccount("12345", "Madhu", 1000);

        // Display account info
        account.displayAccountInfo();

        // Deposit money
        account.deposit(500);

        // Withdraw money
        account.withdraw(200);

        // Try invalid withdrawal
        account.withdraw(2000);

        // Display final account info
        account.displayAccountInfo();
    }

}
