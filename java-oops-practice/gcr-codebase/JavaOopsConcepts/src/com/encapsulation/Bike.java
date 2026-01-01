package com.encapsulation;

class Bike extends Vehicle implements Insurable {

	    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
	        super(vehicleNumber, "Bike", rentalRate, policyNumber);
	    }

	    //Override
	    public double calculateRentalCost(int days) {
	        return rentalRate * days * 0.9; 
	    }

	    //Override
	    public double calculateInsurance() {
	        return 200;
	    }

	    //Override
	    public String getInsuranceDetails() {
	        return "Bike Insurance | Policy: " + getPolicyNumber();
	    }
	}


