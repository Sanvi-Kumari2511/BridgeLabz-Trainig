package com.smarthomeautomationsystem;

abstract class Appliance implements Controllable{

	    private boolean powerStatus;
	    private int powerConsumption;   

	    //Constructor
	    Appliance(int powerConsumption) {
	        this.powerConsumption = powerConsumption;
	        this.powerStatus = false;
	    }

	    //Protected getter for subclasses
	    protected int getPowerConsumption() {
	        return powerConsumption;
	    }

	    //Public method to check appliance status
	    public boolean isOn() {
	        return powerStatus;
	    }

	    //Common ON behavior
	    protected void switchOn() {
	        powerStatus = true;
	    }

	    //Common OFF behavior
	    protected void switchOff() {
	        powerStatus = false;
	    }
	}

