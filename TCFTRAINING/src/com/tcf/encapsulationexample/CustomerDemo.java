package com.tcf.encapsulationexample;

public class CustomerDemo extends Customer{
		    public static void main(String[] args) {
		        Customer c1 = new Customer();
		        c1.setCid(101);
		        c1.setName("Sathiya");
		        c1.setCity("Mumbai");
		        System.out.println(c1); 
		        // object printing invokes toString()

		        Customer c2 = new Customer();
		        c2.setCid(102);
		        c2.setName("Niraimathy");
		        c2.setCity("Chennai");
		        System.out.println(c2);

		        Customer c3 = new Customer();
		        c3.setCid(103);
		        c3.setName("Sravya");
		        c3.setCity("Bangalore");
		        System.out.println(c3);
		    }
		
}
