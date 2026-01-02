package com.circularlinkedlist;

public class OnlineTicketApp {
	
	    public static void main(String[] args) {

	        TicketList list = new TicketList();

	        list.addTicket(101, "Alice", "Inception", 12, "10:30 AM");
	        list.addTicket(102, "Bob", "Avatar", 15, "11:00 AM");
	        list.addTicket(103, "Charlie", "Inception", 18, "11:30 AM");

	        list.displayTickets();

	        list.searchByCustomer("Alice");
	        list.searchByMovie("Inception");

	        list.countTickets();

	        list.removeTicket(102);
	        list.displayTickets();
	    }
	}

