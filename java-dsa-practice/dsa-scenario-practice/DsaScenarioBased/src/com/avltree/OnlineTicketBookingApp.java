package com.avltree;

public class OnlineTicketBookingApp {
	public static void main(String[] args) {

        TicketBooking booking = new TicketBooking();

        //Insert events
        booking.root = booking.insert(booking.root, 18, "Music Concert");
        booking.insert(booking.root, 8, "Morning Yoga");
        booking.insert(booking.root, 12, "Tech Talk");
        booking.insert(booking.root, 20, "Stand-up Comedy");

        //Show events in order
        System.out.println("Upcoming Events:");
        booking.inorder(booking.root);

        //Cancel an event
        booking.root = booking.delete(booking.root, 12);

        System.out.println("\nAfter Cancelling Event at 12:");
        booking.inorder(booking.root);
    }
}
