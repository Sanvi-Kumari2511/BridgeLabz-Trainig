package com.vehiclerentalapplication;

 class Truck extends Vehicle {

	    private double loadCharge = 700;
        
	    //Constructor
	    Truck(String vehicleNumber, double rate) {
	        super(vehicleNumber, rate);
	    }

	    //Override
	    public double calculateRent(int days) {
	        return (rate * days) + loadCharge;
	    }
	}
