package com.cabbygo;
//Main class to test the application
public class CabbyApp {
	
	    public static void main(String[] args) {

	        //Creating vehicle object using polymorphism
	        Vehicle vehicle = new Sedan("SD12L1234");

	        //Creating driver object
	        Driver driver = new Driver("Sanvi", "LC1542345GH", 4.0);

	        //Interface reference holding implementation object
	        IRideService rideService = new CabService(vehicle, driver);

	        //Booking a ride for 10 km
	        rideService.bookRide(10);

	        //Ending the ride
	        rideService.endRide();
	    }
	}

