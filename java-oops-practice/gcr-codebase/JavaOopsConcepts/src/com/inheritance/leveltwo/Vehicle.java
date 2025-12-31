package com.inheritance.leveltwo;

public class Vehicle {
   int maxSpeed;
   String model;

	    Vehicle(int maxSpeed, String model) {
	        this.maxSpeed = maxSpeed;
	        this.model = model;
	    }

	    void displayVehicleInfo() {
	        System.out.println("Model: " + model);
	        System.out.println("Maximum Speed: " + maxSpeed + " km/h");
	    }
	}

  