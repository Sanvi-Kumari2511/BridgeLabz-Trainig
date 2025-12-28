package com.constructor.levelone;

public class MainCarRental {
	public static void main(String args []){
		
	     //By default constructor
	     CarRental carRental1 = new CarRental();
		 carRental1.show();
		 
		 //By parameterized constructor
		 CarRental carRental2 = new CarRental("Sanvi", "Tata", 3, 3000.0);
		 carRental2.show();
	}
}
