package com.smarthomeautomationsystem;

public class UserController {

	    //Turn appliance ON
	    public void powerOn(Controllable device) {
	        device.turnOn();
	    }

	    //Turn appliance OFF
	    public void powerOff(Controllable device) {
	        device.turnOff();
	    }

	    //Compare energy usage of two appliances
	    public void compareUsage(Appliance a1, Appliance a2) {

	        if (a1.getPowerConsumption() > a2.getPowerConsumption()) {
	            System.out.println("First appliance consumes more power");
	        } 
	        else if (a1.getPowerConsumption() < a2.getPowerConsumption()) {
	            System.out.println("Second appliance consumes more power");
	        } 
	        else {
	            System.out.println("Both appliances consume equal power");
	        }
	    }
	}

