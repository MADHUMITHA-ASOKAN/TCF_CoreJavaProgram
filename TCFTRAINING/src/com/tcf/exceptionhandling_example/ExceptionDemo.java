package com.tcf.exceptionhandling_example;

public class ExceptionDemo {
	public static void main(String[] args) {
		try{
			int a=10;
		    int b=0;
		    int c;
		    c=a/b; //raising exception object
		    System.out.println("dividion : "+c);
		}
		catch(ArithmeticException a){
			System.err.println("current exception is : "+a.getMessage());
		}
		System.out.println("next line....");
	}

}
