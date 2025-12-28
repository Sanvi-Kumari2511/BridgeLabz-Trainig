package com.constructor.levelone;

public class CarRental {
	private String customerName;
	private String carModel;
	private int rentalDays;
	private double rentalRate;
	
	//Default constructor
	CarRental(){
	    this.customerName = "Sanvi";
		this.carModel = "Standard";
		this.rentalDays = 1;
		this.rentalRate = 2000.0;
	}
	
	//Parameterized constructor
	CarRental(String customerName, String carModel, int rentalDays, double rentalRate){
	    this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
		this.rentalRate = rentalRate;
	}
	
	double totalCost(){
	    return rentalRate * rentalDays;
	}
	void show(){
	    System.out.println("Customer Name: " + customerName);
		System.out.println("Car Model: " + carModel);
		System.out.println("Rental Days: " + rentalDays);
		System.out.println("Total Cost: " + totalCost());
	}
}
