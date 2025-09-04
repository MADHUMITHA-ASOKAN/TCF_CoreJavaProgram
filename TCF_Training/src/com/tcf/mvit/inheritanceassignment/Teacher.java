package com.tcf.mvit.inheritanceassignment;

public class Teacher extends Person{
	private int employeeId;
    private String subject;

    public Teacher(String name, int age, int employeeId, String subject) {
        super(name, age);  // Call Person constructor
        this.employeeId = employeeId;
        this.subject = subject;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Subject: " + subject);
    }

}
