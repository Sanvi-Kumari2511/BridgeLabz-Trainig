package com.tourmate;

public class TourMateApp {

	        public static void main(String[] args) {

	            // Creating services
	            Transport transport = new Transport(15000);
	            Hotel hotel = new Hotel(20000);
	            Activity activity = new Activity(5000);

	            // Runtime polymorphism
	            IBookable domesticTrip = new DomesticTrip("Goa", 5, transport, hotel, activity);

	            IBookable internationalTrip = new InternationalTrip("Paris", 7,
	                            new Transport(60000),
	                           new Hotel(80000),
	                            new Activity(20000));

	            // Booking trips
	            domesticTrip.book();
	            System.out.println();
	            internationalTrip.book();
	        }
	    }

