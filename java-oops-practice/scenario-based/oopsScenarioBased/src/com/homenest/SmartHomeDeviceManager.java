package com.homenest;

public class SmartHomeDeviceManager {

	    public static void main(String[] args) {

	        //Device reference (Polymorphism)
	        Device d1 = new Light("LIGHT-101");
	        Device d2 = new Camera("CAM-202");
	        Device d3 = new Thermostat("THERMO-303");
	        Device d4 = new Lock("LOCK-404");

	        d1.turnOn();
	        d2.turnOn();
	        d3.turnOn();

	        System.out.println();
	        
	        System.out.println("Energy used by Light in 5 hrs: " + d1.calculateEnergy(5));
	        
	        System.out.println("Energy used by Camera in 3 hrs: " + d2.calculateEnergy(3));

	        //Polymorphic reset
	        d1.reset();
	        d2.reset();
	        d3.reset();
	        d4.reset();

	        d1.turnOff();
	    }
}


