package com.eventease;
import java.time.LocalDate;

public class Event implements ISchedulable{
	
	    protected String eventName;
	    protected String location;
	    protected LocalDate date;
	    protected int attendees;

	    private final int eventId;      
	    private static int counter = 1000;

	    //Encapsulated pricing details
	    private double venueCost;
	    private double serviceCost;
	    private double discount;

	    protected User organizer;

	    //Constructor without services
	    public Event(String eventName, String location, LocalDate date,
	                 int attendees, User organizer, double venueCost) {
	        this.eventName = eventName;
	        this.location = location;
	        this.date = date;
	        this.attendees = attendees;
	        this.organizer = organizer;
	        this.venueCost = venueCost;
	        this.serviceCost = 0;
	        this.discount = 0;
	        this.eventId = ++counter;
	    }

	    //Constructor with catering/decoration services
	    public Event(String eventName, String location, LocalDate date,
	                 int attendees, User organizer,
	                 double venueCost, double serviceCost, double discount) {
	        this(eventName, location, date, attendees, organizer, venueCost);
	        this.serviceCost = serviceCost;
	        this.discount = discount;
	    }

	    //Calculating total event cost using operators
	    public double calculateTotalCost() {
	        return venueCost + serviceCost - discount;
	    }

	    //Getter for eventId 
	    public int getEventId() {
	        return eventId;
	    }

	    //Default scheduling behavior (Override)
	    public void schedule() {
	        System.out.println("Event '" + eventName + "' scheduled on " + date);
	    }

	    //Override
	    public void reschedule() {
	        System.out.println("Event '" + eventName + "' has been rescheduled.");
	    }

	    //Override
	    public void cancel() {
	        System.out.println("Event '" + eventName + "' has been cancelled.");
	    }

	    //Displaying event details
	    public void showDetails() {
	        System.out.println("Event ID: " + eventId);
	        System.out.println("Event: " + eventName);
	        System.out.println("Location: " + location);
	        System.out.println("Attendees: " + attendees);
	        System.out.println("Organizer: " + organizer.getName());
	        System.out.println("Total Cost: " + calculateTotalCost());
	    }
	}

