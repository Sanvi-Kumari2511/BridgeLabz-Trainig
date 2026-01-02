package com.smarthomeautomationsystem;

 class Light extends Appliance {

	    Light() {
	        super(40); 
	    }
	    //Override
	    public void turnOn() {
	        switchOn();
	        System.out.println("Light is ON ");
	    }

	    //Override
	    public void turnOff() {
	        switchOff();
	        System.out.println("Light is OFF");
	    }
	}


