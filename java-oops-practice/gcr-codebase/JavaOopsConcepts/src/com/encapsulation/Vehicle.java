package com.encapsulation;

abstract class Vehicle {
  
	//Encapsulated fields
	private String vehicleNumber;
	private String type;
	protected double rentalRate;
	private String policyNumber;
	
	//Constructor
	public Vehicle (String vehicleNumber, String type, double rentalRate, String policyNumber) {
		this.vehicleNumber = vehicleNumber;
		this.type =  type;
		this.rentalRate = rentalRate;
		this.policyNumber = policyNumber;
		
	}
	
	//Abstract method
	public abstract double calculateRentalCost(int days);
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public String getType() {
		return type;
	}
	
	public double getRentalRate() {
		return rentalRate;
	}
	
	protected String getPolicyNumber() {
		return "XXXX-XXXX" + policyNumber.substring(policyNumber.length() - 4);
	}
	
}
