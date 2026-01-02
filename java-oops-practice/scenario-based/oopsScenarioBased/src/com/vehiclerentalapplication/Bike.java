package com.vehiclerentalapplication;

 class Bike extends Vehicle{
	    
	    //Constructor
	    Bike(String vehicleNumber, double rate) {
	        super(vehicleNumber, rate);
	    }

	    //Override
	    public double calculateRent(int days) {
	        return rate * days;  
	    }

}
