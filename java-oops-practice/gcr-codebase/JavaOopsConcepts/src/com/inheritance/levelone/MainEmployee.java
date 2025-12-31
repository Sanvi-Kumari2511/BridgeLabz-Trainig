package com.inheritance.levelone;

public class MainEmployee {
	
	    public static void main(String[] args) {

	        Employee e1 = new Manager("Rishabh", 101, 90000, 5);
	        Employee e2 = new Developer("Sanvi", 102, 55000, "Java");
	        Employee e3 = new Intern("Shivani", 103, 15000, 6);

	        e1.displayDetails();
	        System.out.println();

	        e2.displayDetails();
	        System.out.println();

	        e3.displayDetails();
	    }
	}

