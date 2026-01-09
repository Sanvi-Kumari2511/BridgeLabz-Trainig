package com.tourmate;

 class InternationalTrip extends Trip {
	
	     public InternationalTrip(String destination, int duration,
	                              Transport transport, Hotel hotel, Activity activity) {
	         super(destination, duration, transport, hotel, activity);
	     }

	     //Polymorphic behavior( Override)
	     public void book() {
	         System.out.println("International trip booked to " + destination);
	         System.out.println("Passport & Visa required.");
	         System.out.println("Budget: ₹" + budget);
	     }
	 }

