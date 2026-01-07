package com.parkease;

class Truck extends Vehicle {

	    public Truck(String vehicleNumber) {
	        super(vehicleNumber, 100);
	    }

	    // Charge calculation for truck( Override)
	    public double calculateCharges(int hours) {
	        int allowedHours = 4;
	        double penalty = (hours > allowedHours) ? 200 : 0;
	        return (baseRate * hours) + penalty;
	    }
	}

