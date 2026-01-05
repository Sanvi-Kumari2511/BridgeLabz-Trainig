package com.campusconnect;

public class Faculty extends Person {
	

	    String department;

	    Faculty(String name, String email, int id, String department) {
	        super(name, email, id);
	        this.department = department;
	    }

	    //Override
	    void printDetails() {   
	        super.printDetails();
	        System.out.println("Role: Faculty");
	        System.out.println("Department: " + department);
	    }
	}

