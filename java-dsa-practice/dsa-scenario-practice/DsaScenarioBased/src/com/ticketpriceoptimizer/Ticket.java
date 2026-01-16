package com.ticketpriceoptimizer;

public class Ticket {
  int ticketId;
  double price;
  
  //Constructor to initialize ticket details
  Ticket(int ticketId, double price){
	  this.ticketId = ticketId;
	  this.price = price;
  }
  
  void display() {
	  System.out.println("Ticket ID: " + ticketId + " Price: " + price);
	  
	  }
}
