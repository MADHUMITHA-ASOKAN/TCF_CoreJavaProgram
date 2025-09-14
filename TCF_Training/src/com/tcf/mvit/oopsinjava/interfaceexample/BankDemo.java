package com.tcf.mvit.oopsinjava.interfaceexample;

public class BankDemo {
	public static void main(String[] args) {
        // Creating objects of different bank types
        Bank sbibank= new SBI();  // SBI Bank object
        Bank hdfcbank= new HDFC();  // HDFC Bank object

        // Displaying the rate of interest for each bank
        System.out.println("SBI Bank Rate of Interest: " + sbibank.rateOfInterest() + "%");
        System.out.println("HDFC Bank Rate of Interest: " + hdfcbank.rateOfInterest() + "%");
    }
}
