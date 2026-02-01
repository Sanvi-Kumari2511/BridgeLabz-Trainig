package com.functionalinterface.defaultmethod.smartvehicledashboard;

public class DashboardApp {
	 public static void main(String[] args) {
		 //Normal vehicle using lamda
		 VehicleDashboard car = (speed) -> System.out.println("Car speed: " + speed + " km/h");
		 
		 car.displaySpeed(80);
		 car.displayBattery();
		 
		 System.out.println();
		 
	    //Electric vehicle using lamda
		 VehicleDashboard electricCar = (speed) -> System.out.println("Electric Car speed: " + speed + " km/h");
		 
		 electricCar.displaySpeed(90);
		 electricCar.displayBattery();
	 }
}
