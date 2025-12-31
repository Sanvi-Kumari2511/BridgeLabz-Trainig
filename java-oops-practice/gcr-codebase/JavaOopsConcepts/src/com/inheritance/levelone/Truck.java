package com.inheritance.levelone;

 class Truck extends Vehicle {
	 int tier;
		Truck (int maxSpeed, String fuelType, int tier){
			super (maxSpeed, fuelType);
			this.tier = tier;
		}
		
		//Override
		void displayInfo() {
			super.displayInfo();
			System.out.println("Maximum tier in a truck: " + tier);
		}
}
