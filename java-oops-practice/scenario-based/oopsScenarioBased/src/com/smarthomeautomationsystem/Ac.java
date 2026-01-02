package com.smarthomeautomationsystem;

 class Ac extends Appliance {

	    Ac(int powerConsumption) {
	        super(powerConsumption); 
	    }
	    //Override
	    public void turnOn() {
	        switchOn();
	        System.out.println("AC turned ON with cooling mode");
	    }

	    //Override
	    public void turnOff() {
	        switchOff();
	        System.out.println("AC turned OFF");
	    }
	}


