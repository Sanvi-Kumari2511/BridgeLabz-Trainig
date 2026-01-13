package com.homenest;

abstract class Device implements IControllable {
	
	protected String deviceId;
    private boolean status;              
    protected double energyUsage;         

    //Secured firmware update logs
    protected String firmwareLog;

    //Constructor to register device
    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "Firmware v1.0 installed";
    }

    //Encapsulation: no direct modification allowed
    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    //Energy usage calculation using operators
    public double calculateEnergy(int hours) {
        return energyUsage * hours;
    }

    //Common behavior
    public void turnOn() {
        setStatus(true);
        
       
        
        System.out.println(deviceId + " turned ON");
    }

    public void turnOff() {
        setStatus(false);
        
        
        System.out.println(deviceId + " turned OFF");
    }

    //Polymorphic method
    public abstract void reset();
}
