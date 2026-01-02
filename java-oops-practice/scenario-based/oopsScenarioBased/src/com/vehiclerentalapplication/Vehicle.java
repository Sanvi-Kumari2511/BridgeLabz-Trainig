package com.vehiclerentalapplication;

class Vehicle  implements Rentable{
	
	    protected String vehicleNumber;
	    protected double rate;

	    //Constructor
	    Vehicle(String vehicleNumber, double rate) {
	        this.vehicleNumber = vehicleNumber;
	        this.rate = rate;
	    }
        
	    //Method to calculate rent
	    public double calculateRent(int days) {
	        return rate * days;
	    }
        
	    //Method to display information
	    public void displayInfo() {
	        System.out.println("Vehicle Number is: " + vehicleNumber);
	    }
}
