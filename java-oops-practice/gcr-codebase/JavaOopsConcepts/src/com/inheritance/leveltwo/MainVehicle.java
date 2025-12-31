package com.inheritance.leveltwo;

public class MainVehicle {
	    public static void main(String[] args) {

	        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3");

	        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");

	        System.out.println("Details of Electric Vehicle:");
	        ev.displayVehicleInfo();
	        ev.charge();

	        System.out.println();

	        System.out.println("Details of Petrol Vehicle:");
	        pv.displayVehicleInfo();
	        pv.refuel();
	    }
	}

