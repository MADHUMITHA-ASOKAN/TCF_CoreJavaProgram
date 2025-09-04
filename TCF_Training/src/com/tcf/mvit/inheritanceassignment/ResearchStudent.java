package com.tcf.mvit.inheritanceassignment;

public class ResearchStudent extends Student{
	private String researchTopic;
    private String supervisorName;

    public ResearchStudent(String name, int age, int rollNo, String course, String researchTopic, String supervisorName) {
        super(name, age, rollNo, course); // Call Student constructor
        this.researchTopic = researchTopic;
        this.supervisorName = supervisorName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("Supervisor: " + supervisorName);
    }
}
