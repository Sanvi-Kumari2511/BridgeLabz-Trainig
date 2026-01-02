package com.hospitalpatientmanagementsystem;

 class InPatient extends Patient {
	
	    private int admittedDays;

	    //Connstructor
	    InPatient(String name, int age, int admittedDays) {
	        super(name, age);
	        this.admittedDays = admittedDays;
	    }

	    //Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Number of days patient admitted : " + admittedDays);
	    }
	}

