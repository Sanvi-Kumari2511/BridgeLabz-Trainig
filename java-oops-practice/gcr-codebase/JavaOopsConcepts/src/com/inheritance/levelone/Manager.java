package com.inheritance.levelone;

public class Manager extends Employee {
   //Constructor
	    int sizeOfTeam;

	    Manager(String name, int id, double salary, int sizeOfTeam) {
	        super(name, id, salary);
	        
	        this.sizeOfTeam = sizeOfTeam;
	    }

	   //Override
	    void displayDetails() {
	        super.displayDetails();
	        System.out.println("Team Size: " + sizeOfTeam);
	    }
	}

