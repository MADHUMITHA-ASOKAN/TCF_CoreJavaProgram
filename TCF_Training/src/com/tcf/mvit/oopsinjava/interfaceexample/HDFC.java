package com.tcf.mvit.oopsinjava.interfaceexample;

public class HDFC implements Bank {
	// Implementing the rateOfInterest method for HDFC
	 @Override
	 public double rateOfInterest() {
	     return 8.0;  // HDFC has an interest rate of 8.0%
	 }
}
