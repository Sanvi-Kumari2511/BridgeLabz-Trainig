package com.inheritance.levelone;

 class Motorcycle extends Vehicle{
	String company;
	Motorcycle (int maxSpeed, String fuelType, String company){
		super (maxSpeed, fuelType);
		this.company = company;
	}
	
	//Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Company of the Motorcycle is: " + company);
	}
}
