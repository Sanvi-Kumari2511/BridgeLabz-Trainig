package com.eventease;
import java.time.LocalDate;

public class BirthdayEvent extends Event{

	    public BirthdayEvent(String eventName, String location, LocalDate date, int attendees, User organizer, double venueCost, double serviceCost) {
	        super(eventName, location, date, attendees, organizer, venueCost, serviceCost, 500);
	    }

	    //Polymorphic behavior (Override)
	    public void schedule() {
	        System.out.println("Birthday party '" + eventName + "' scheduled with cake and decorations");
	    }
	}

