package com.inheritance.levelone;

class Developer extends Employee {
	//Constructor
	    String language;

	    Developer(String name, int id, double salary, String language) {
	        super(name, id, salary);
	        this.language = language;
	    }

	    //Override
	    void displayDetails() {
	        super.displayDetails();
	        System.out.println("Developer using programming language: " + language);
	    }
	}
