package com.constructor.levelone;

public class MainHotelBooking {
	public static void main(String args []){
	      HotelBooking booking1 = new HotelBooking();
		  booking1.show();
		  
		  System.out.println();
		  
		  HotelBooking booking2 = new HotelBooking("Sanvi", "Standard", 2);
		  booking2.show();
		  
		  System.out.println();
		  
		  HotelBooking booking3 = new HotelBooking(booking2);
		  booking3.show();
		  
	}   
}
