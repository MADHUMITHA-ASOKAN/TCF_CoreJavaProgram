package com.tcf.mvit.Assignment.inheritance;

public class Student extends Person{
	protected int rollNo;
    protected String course;

    public Student(String name, int age, int rollNo, String course) {
        super(name, age);  // Call parent constructor
        this.rollNo = rollNo;
        this.course = course;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
