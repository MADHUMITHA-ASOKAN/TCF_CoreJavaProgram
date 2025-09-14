package com.tcf.mvit.Assignmentconstuctor;

public class Student {
	 private int id;
	    private String name;
	    private String course;

	    // Parameterized Constructor
	    public Student(int id, String name, String course) {
	        this.id = id;
	        this.name = name;
	        this.course = course;
	    }

	    // Method to display student info
	    public void displayInfo() {
	        System.out.println("Student ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Course: " + course);
	        System.out.println("-----------------------");
	    }

}
