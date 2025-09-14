package com.tcf.mvit.lambdaexpression;

@MyFunctionalInterface {
	public interface MyFunctionalInterface {
	    // Abstract method
	    void sayHello(String name);

	    // Default method
	    default void sayGoodbye() {
	        System.out.println("Goodbye!");
	    }
}
