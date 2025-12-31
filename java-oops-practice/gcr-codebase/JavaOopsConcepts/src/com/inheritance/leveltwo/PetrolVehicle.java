package com.inheritance.leveltwo;

public class PetrolVehicle extends Vehicle {
	
	    PetrolVehicle(int maxSpeed, String model) {
	        super(maxSpeed, model);
	    }

	    //Override
	    void refuel() {
	        System.out.println("Refueling the petrol vehicle");
	    }
	}


