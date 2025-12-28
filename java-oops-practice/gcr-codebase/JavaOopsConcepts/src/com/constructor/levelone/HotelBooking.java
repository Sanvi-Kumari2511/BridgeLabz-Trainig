package com.constructor.levelone;

public class HotelBooking {
	private String guestName;
	private String roomType;
	private int nights;
	
	//Default constructor
	HotelBooking(){
	}
	
	//Parameterized constructor
	HotelBooking(String guestName, String roomType, int nights){
	     this.guestName = guestName;
		 this.roomType = roomType;
		 this.nights = nights;
	}
	
	//Copy constructor
	HotelBooking(HotelBooking booking){
	      this.guestName = booking.guestName;
		  this.roomType = booking.roomType;
		  this.nights = booking.nights;
	}
	
	void show(){
	      System.out.println("Guest Name is: " + guestName);
		  System.out.println("Room type is: " + roomType);
     	  System.out.println("Nights: " + nights);
    }
}
