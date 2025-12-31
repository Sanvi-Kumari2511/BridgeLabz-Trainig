package com.inheritance.leveltwo;

class Thermostat extends Device {
	    int temperatureSetting;

	    //Constructor
	    Thermostat(String deviceId, boolean status, int temperatureSetting) {
	        super(deviceId, status);
	        this.temperatureSetting = temperatureSetting;
	    }

	    //Overriding displayStatus method
	    void displayStatus() {
	        super.displayStatus();
	        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
	    }
	}



