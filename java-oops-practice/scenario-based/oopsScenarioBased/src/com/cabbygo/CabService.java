package com.cabbygo;
//CabService class that provides ride functionality
 class CabService implements IRideService{
	
	    private Vehicle vehicle; 
	    private Driver driver;   
	    private double fare;     

	    private final double baseFare = 50; 

	    //Constructor to initialize vehicle and driver
	    public CabService(Vehicle vehicle, Driver driver) {
	        this.vehicle = vehicle;
	        this.driver = driver;
	    }

	    //Book ride and calculate fare (override)
	    public void bookRide(double distance) {

	        //Fare calculation using operators
	        fare = baseFare + distance * vehicle.getRate();

	        System.out.println("Ride booked successfully");
	        System.out.println("Vehicle Type: " + vehicle.getType());
	        System.out.println("Driver Name: " + driver.getName());
	        System.out.println("Total Fare: " + fare);
	    }

	    // End the ride (override)
	    public void endRide() {
	        System.out.println("Ride ended. Thank you!");
	    }
	}

