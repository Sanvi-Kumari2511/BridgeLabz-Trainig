package com.parkease;

class Bike extends Vehicle {
	
	    public Bike(String vehicleNumber) {
	        super(vehicleNumber, 20); 
	    }

	    //Charge calculation for bike(Override)
	    public double calculateCharges(int hours) {
	        int allowedHours = 6;
	        double penalty = (hours > allowedHours) ? 50 : 0;
	        return (baseRate * hours) + penalty;
	    }
	}

