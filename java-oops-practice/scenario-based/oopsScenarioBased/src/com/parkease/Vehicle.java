package com.parkease;

 abstract class Vehicle implements IPayable {

	     protected String vehicleNumber;
	     protected double baseRate; 

	     //Constructor to initialize vehicle details
	     public Vehicle(String vehicleNumber, double baseRate) {
	         this.vehicleNumber = vehicleNumber;
	         this.baseRate = baseRate;
	     }
	 }

