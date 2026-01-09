package com.tourmate;

 class DomesticTrip extends Trip {

	     public DomesticTrip(String destination, int duration,
	                         Transport transport, Hotel hotel, Activity activity) {
	         super(destination, duration, transport, hotel, activity);
	     }

	     // Polymorphic behavior(Override)
	     public void book() {
	         System.out.println("Domestic trip booked to " + destination);
	         System.out.println("ID proof required.");
	         System.out.println("Budget: ₹" + budget);
	     }
	 }

