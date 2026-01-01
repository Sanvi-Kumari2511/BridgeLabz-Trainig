package com.encapsulation;
import java.util.ArrayList;
import java.util.List;

public class MainVehicle {

	    public static void main(String[] args) {

	        List<Vehicle> vehicles = new ArrayList<>();

	        vehicles.add(new Car("MH132283", 2000, "CAR984321"));
	        vehicles.add(new Bike("MH138572", 1000, "BIK123499"));
	        vehicles.add(new Truck("MH20923", 4000, "TRK11223"));

	        int rentalDays = 2;

	        for (Vehicle vehicle : vehicles) {

	            double rentalCost = vehicle.calculateRentalCost(rentalDays);
	            double insuranceCost = 0;

	            System.out.println("Vehicle Type: " + vehicle.getType());
	            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
	            System.out.println("Rental Cost: " + rentalCost);

	            if (vehicle instanceof Insurable) {
	                Insurable insurable = (Insurable) vehicle;
	                insuranceCost = insurable.calculateInsurance();
	                 System.out.println("Insurance Cost: " + insuranceCost);
	                System.out.println(insurable.getInsuranceDetails());
	            }

	            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
	            System.out.println("-------------------------------");
	        }
	    }
	}

