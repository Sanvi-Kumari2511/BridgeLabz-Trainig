package com.vehiclerentalapplication;

class Car extends Vehicle {
	
	    private double charge = 500;
        
	    //Constructor
	    Car(String vehicleNumber, double rate) {
	        super(vehicleNumber, rate);
	    }

	    //Override
	    public double calculateRent(int days) {
	        return (rate * days) + charge;
	    }
}


