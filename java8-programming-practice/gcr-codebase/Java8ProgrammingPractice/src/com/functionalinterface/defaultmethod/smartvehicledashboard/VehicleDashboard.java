package com.functionalinterface.defaultmethod.smartvehicledashboard;

@FunctionalInterface
public interface VehicleDashboard {
   void displaySpeed(int speed);
   
   //Default method 
   default void displayBattery() {
	   System.out.println("Battery information is not available");
   }
}
