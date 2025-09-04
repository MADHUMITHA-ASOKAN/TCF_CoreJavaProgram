package com.tcf.mvit.thiskewordasignment;

public class Main {
	 public static void main(String[] args) {
	        BookStore store = new BookStore();

	        // Default constructor (calls parameterized using this())
	        Book b1 = new Book();
	        b1.display();
	        b1.addToStore(store);

	        // Parameterized constructor
	        Book b2 = new Book(101, "Java Programming", "James Gosling", 499.99);
	        b2.display();
	        b2.addToStore(store);

	        Book b3 = new Book(102, "Effective Java", "Joshua Bloch", 699.50);
	        b3.display();
	        b3.addToStore(store);
	    }

}
