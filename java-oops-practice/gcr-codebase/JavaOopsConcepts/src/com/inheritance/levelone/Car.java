package com.inheritance.levelone;

class Car extends Vehicle {
	int seat;
	Car (int maxSpeed, String fuelType, int seat){
		super (maxSpeed, fuelType);
		this.seat = seat;
	}
	
	//Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Maximum seat capacity: " + seat);
	}

}
