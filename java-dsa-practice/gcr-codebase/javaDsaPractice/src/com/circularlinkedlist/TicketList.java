package com.circularlinkedlist;

public class TicketList {

	    private Ticket head = null;
	    private Ticket tail = null;

	    //Adding ticket at end
	    public void addTicket(int id, String customer, String movie, int seat, String time) {

	        Ticket node = new Ticket(id, customer, movie, seat, time);

	        if (head == null) {
	            head = tail = node;
	            node.next = head;
	        }
	        else {
	            tail.next = node;
	            tail = node;
	            tail.next = head;
	        }

	        System.out.println("Ticket booked successfully");
	    }

	    //Removing ticket by Ticket ID
	    public void removeTicket(int ticketId) {

	        if (head == null) {
	            System.out.println("No tickets available");
	            return;
	        }

	        Ticket current = head;
	        Ticket prev = tail;

	        do {
	            if (current.ticketId == ticketId) {

	                // Only one ticket
	                if (head == tail) {
	                    head = tail = null;
	                }
	                
	                //Removing head
	                else if (current == head) {
	                    head = head.next;
	                    tail.next = head;
	                }
	                
	                //Removing tail
	                else if (current == tail) {
	                    tail = prev;
	                    tail.next = head;
	                }
	                
	                //Removing middle node
	                else {
	                    prev.next = current.next;
	                }

	                System.out.println("Ticket removed successfully");
	                return;
	            }

	            prev = current;
	            current = current.next;

	        } 
	        
	        while (current != head);

	        System.out.println("Ticket not found");
	    }

	    //Displaying all tickets
	    public void displayTickets() {

	        if (head == null) {
	            System.out.println("No tickets booked");
	            return;
	        }

	        Ticket temp = head;
	        System.out.println("\nBooked Tickets:");

	        do {
	            displayTicket(temp);
	            temp = temp.next;
	        } 
	        
	        while (temp != head);
	    }

	    //Searching ticket by Customer Name
	    public void searchByCustomer(String customerName) {

	        if (head == null) {
	            System.out.println("No tickets available.");
	            return;
	        }

	        Ticket temp = head;
	        boolean found = false;

	        do {
	            if (temp.customerName.equalsIgnoreCase(customerName)) {
	                displayTicket(temp);
	                found = true;
	            }
	            temp = temp.next;
	        } 
	        
	        while (temp != head);

	        if (!found) {
	            System.out.println("No ticket found for this customer.");
	        }
	    }

	    //Searching ticket by Movie Name
	    public void searchByMovie(String movieName) {

	        if (head == null) {
	            System.out.println("No tickets available.");
	            return;
	        }

	        Ticket temp = head;
	        boolean found = false;

	        do {
	            if (temp.movieName.equalsIgnoreCase(movieName)) {
	                displayTicket(temp);
	                found = true;
	            }
	            
	            temp = temp.next;
	        }
	        
	        while (temp != head);

	        if (!found) {
	            System.out.println("No tickets found for this movie");
	        }
	    }

	    //Counting total booked tickets
	    public void countTickets() {

	        if (head == null) {
	            System.out.println("Total tickets: 0");
	            return;
	        }

	        int count = 0;
	        Ticket temp = head;

	        do {
	            count++;
	            temp = temp.next;
	        }
	        
	        while (temp != head);

	        System.out.println("Total booked tickets: " + count);
	    }

	    //Helper method
	    private void displayTicket(Ticket t) {
	        System.out.println("Ticket ID: " + t.ticketId +
	                ", Customer: " + t.customerName +
	                ", Movie: " + t.movieName +
	                ", Seat: " + t.seatNumber +
	                ", Time: " + t.bookingTime);
	    }
	}

