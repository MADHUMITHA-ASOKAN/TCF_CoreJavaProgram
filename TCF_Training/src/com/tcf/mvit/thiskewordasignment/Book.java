package com.tcf.mvit.thiskewordasignment;

public class Book {
	private int id;
    private String title;
    private String author;
    private double price;

    // 1. Constructor chaining with this()
    public Book() {
        this(0, "Unknown", "Unknown", 0.0);  // Calls parameterized constructor
        System.out.println("Default constructor called");
    }

    // 2. Differentiate instance variables using this
    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 3. Calling another method using this.methodName()
    public void showBookInfo() {
        System.out.println("=== Book Information ===");
        System.out.println("ID: " + id + ", Title: " + title +
                           ", Author: " + author + ", Price: " + price);
    }

    public void display() {
        this.showBookInfo(); // Calling method with this
    }

    // 4. Passing current object to another class
    public void addToStore(BookStore store) {
        store.addBook(this);
    }

    // 5. Returning current object
    public Book getBook() {
        return this;
     
        public String getTitle() {
            return this.title;
        }

        public String getAuthor() {
            return this.author;
        }
    }

	public String getauthor() {
		// TODO Auto-generated method stub
		return null;
	}

	public String gettitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
