package com.homenest;

 class Thermostat extends Device {
	 public Thermostat(String deviceId) {
	        super(deviceId, 2.0);
	    }

	    //Override
	    public void reset() {
	        System.out.println("Thermostat " + deviceId + " reset: Temperature set to 10°C");
	        
	        System.out.println();
	    }
}
