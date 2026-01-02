package com.vehiclerentalapplication;

public class VehicleRentalApp {

	    public static void main(String[] args) {

	        Customer c1 = new Customer("Sanvi");

	        Vehicle v1 = new Bike("BIKE101", 500);
	        Vehicle v2 = new Car("CAR202", 1000);
	        Vehicle v3 = new Truck("TRUCK303", 1500);

	        System.out.println("Customer Name is: " + c1.getName());

	        System.out.println("Rent of bike: " + v1.calculateRent(3));
	        
	        System.out.println("Rent of car: " + v2.calculateRent(2));
	        
	        System.out.println("Rent of truck: " + v3.calculateRent(1));
	    }
	}


