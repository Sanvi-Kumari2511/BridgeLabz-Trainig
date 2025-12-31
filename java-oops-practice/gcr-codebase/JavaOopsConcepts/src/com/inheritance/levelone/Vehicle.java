package com.inheritance.levelone;

public class Vehicle {
   int maxSpeed;
   String fuelType;
   
   //Constructor of Vehicle class
   Vehicle (int maxSpeed, String fuelType){
	   this.maxSpeed = maxSpeed;
	   this.fuelType = fuelType;
	   
   }
   
   //Creating a method for overridden
   void displayInfo() {
   System.out.println("Displaying information of vehicle:");
   System.out.println("Maximum speed of vehicle: " + maxSpeed);
   System.out.println("Type of fuel: " + fuelType);
   }
}
