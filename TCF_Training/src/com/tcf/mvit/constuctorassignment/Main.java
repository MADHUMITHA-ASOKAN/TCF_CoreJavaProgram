package com.tcf.mvit.constuctorassignment;

public class Main {
	 public static void main(String[] args) {
	        // Creating multiple students using constructor
	        Student s1 = new Student(101, "Madhu", "Computer Science");
	        Student s2 = new Student(102, "Arun", "Electronics");
	        Student s3 = new Student(103, "Priya", "Mechanical");

	        // Display details
	        s1.displayInfo();
	        s2.displayInfo();
	        s3.displayInfo();
	    }
}
