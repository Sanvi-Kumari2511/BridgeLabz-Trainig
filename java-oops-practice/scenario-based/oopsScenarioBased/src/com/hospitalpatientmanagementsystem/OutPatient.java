package com.hospitalpatientmanagementsystem;

class OutPatient extends Patient{

	    OutPatient(String name, int age) {
	        super(name, age);
	    }

	    //Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Visit of outpatient");
	    }
	}



