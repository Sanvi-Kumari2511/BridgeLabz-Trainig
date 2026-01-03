package com.cabbygo;

//Abstract class representing a generic vehicle
abstract class Vehicle {
	protected String vehicleNumber;
	protected int capacity;
	protected String type;
	protected double rate;
	
	//Constructor to initialize the details of vehicle
	Vehicle(String vehicleNumber, int capacity, String type, double rate){
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.type = type;
		this.rate = rate;
	}
	 
	//Getter method to access rate
    public double getRate() {
        return rate;
    }

    //Getter method to access vehicle type
    public String getType() {
        return type;
    }
}
