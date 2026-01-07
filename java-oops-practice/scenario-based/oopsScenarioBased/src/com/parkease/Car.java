package com.parkease;

 class Car extends Vehicle{

	     public Car(String vehicleNumber) {
	         super(vehicleNumber, 50); 
	     }

	     //Charge calculation for car(Override)
	     
	     public double calculateCharges(int hours) {
	         int allowedHours = 5;
	         double penalty = (hours > allowedHours) ? 100 : 0;
	         return (baseRate * hours) + penalty;
	     }
	 }

