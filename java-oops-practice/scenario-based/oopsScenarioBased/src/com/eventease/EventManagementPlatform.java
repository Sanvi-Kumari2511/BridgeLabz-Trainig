package com.eventease;
import java.time.LocalDate;

public class EventManagementPlatform {
	
	    public static void main(String[] args) {

	        //Creating organizer
	        User organizer = new User("Sanvi Singh", "sanvi@gmail.com");

	        //Creating Birthday Event
	        BirthdayEvent birthday = new BirthdayEvent("Sanvi's Birthday", "Banquet Hall", LocalDate.of(2026, 11, 25), 50, organizer, 20000, 8000);

	        //Creating Conference Event
	        ConferenceEvent conference = new ConferenceEvent("Tech Conference 2026", "Convention Center", LocalDate.of(2026, 5, 20), 300, organizer, 100000, 50000);

	        //Scheduling events
	        birthday.schedule();
	        birthday.showDetails();

	        System.out.println();

	        conference.schedule();
	        conference.showDetails();
	    }
	}
