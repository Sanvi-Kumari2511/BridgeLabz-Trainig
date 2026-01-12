package com.roundaboutvehicleflow;

public class Vehicle {
	
	    String number;      
	    Vehicle next;       

	    //Constructor to initialize the vehicle details
	    public Vehicle(String number) {
	        this.number = number;
	        this.next = null;
	    }
}

