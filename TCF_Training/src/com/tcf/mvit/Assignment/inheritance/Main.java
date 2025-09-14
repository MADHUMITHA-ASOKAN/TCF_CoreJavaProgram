package com.tcf.mvit.Assignment.inheritance;

public class Main {
	public static void main(String[] args) {
        System.out.println("=== Student Info ===");
        Student s1 = new Student("Arun", 20, 101, "Computer Science");
        s1.display();

        System.out.println("\n=== Research Student Info ===");
        ResearchStudent rs1 = new ResearchStudent("Priya", 24, 201, "Electronics", "AI in Healthcare", "Dr. Kumar");
        rs1.display();

        System.out.println("\n=== Teacher Info ===");
        Teacher t1 = new Teacher("Dr. Meena", 40, 301, "Mathematics");
        t1.display();
    }

}
