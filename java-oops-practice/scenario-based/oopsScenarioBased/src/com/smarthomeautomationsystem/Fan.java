package com.smarthomeautomationsystem;

class Fan extends Appliance{

	    Fan() {
	        super(75); 
	    }

	    //Override
	    public void turnOn() {
	        switchOn();
	        System.out.println("Fan turned ON at medium speed");
	    }

	    //Override
	    public void turnOff() {
	        switchOff();
	        System.out.println("Fan turned OFF");
	    }
	}
