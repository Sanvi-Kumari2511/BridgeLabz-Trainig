package com.eventease;
import java.time.LocalDate;

public class ConferenceEvent extends Event {
	
	    public ConferenceEvent(String eventName, String location, LocalDate date, int attendees, User organizer, double venueCost, double serviceCost) {
	        super(eventName, location, date, attendees, organizer, venueCost, serviceCost, 1000);
	    }

	    //Polymorphic behavior (Override)
	    public void schedule() {
	        System.out.println("Conference '" + eventName + "' scheduled with projectors and seating setup");
	    }
	}

	