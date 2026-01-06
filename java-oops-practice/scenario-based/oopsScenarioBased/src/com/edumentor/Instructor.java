package com.edumentor;

public class Instructor extends User implements ICertifiable {
        
	    //Constructor to access the the instructor's details
	    public Instructor(String name, String email, int userId) {
	        super(name, email, userId);
	    }

	    //Override
	    public void generateCertificate() {
	        System.out.println("Instructor " + name + " is authorized to issue certificates.");
	    }
	}


