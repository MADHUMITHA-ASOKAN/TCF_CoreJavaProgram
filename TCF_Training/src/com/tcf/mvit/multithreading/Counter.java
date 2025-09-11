package com.tcf.mvit.multithreading;

class Counter {
	 private int count = 0;

	    // Synchronized method
	    public synchronized void increment() {
	        count++;
	    }

	    public int getCount() {
	        return count;
	    }
}
