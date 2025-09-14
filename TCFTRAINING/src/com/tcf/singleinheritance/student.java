package com.tcf.singleinheritance;

public class student extends person {
	public student() {
		super();
		System.out.println("in default constructor - student");
		
	}
	public void Show() {
		System.out.println(super.name + super.age + super.address);
	}

}
