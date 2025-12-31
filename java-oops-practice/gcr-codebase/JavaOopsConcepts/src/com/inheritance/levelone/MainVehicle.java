package com.inheritance.levelone;

public class MainVehicle {
	
	    public static void main(String[] args) {

	        Vehicle[] vehicles = new Vehicle[3];

	        vehicles[0] = new Car(100, "Petrol", 5);
	        vehicles[1] = new Truck(120, "Diesel", 12);
	        vehicles[2] = new Motorcycle(150, "Petrol", "HeroHonda");

	        for (Vehicle v : vehicles) {
	            v.displayInfo();
	            System.out.println();
	        }
	    }
	}


