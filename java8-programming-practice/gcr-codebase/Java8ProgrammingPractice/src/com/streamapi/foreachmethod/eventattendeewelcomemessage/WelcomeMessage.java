package com.streamapi.foreachmethod.eventattendeewelcomemessage;

import java.util.List;
import java.util.ArrayList;

public class WelcomeMessage {
   public static void main(String args []) {
	   
   
	  //Creating a list of attendees
      List<String> attendees = new ArrayList<>();
  
      attendees.add("Sanvi");
      attendees.add("Sandip");
      attendees.add("Rishabh");
      attendees.add("Shivani");
      attendees.add("Priyanshu");
      
      //Printing result with welcome message
      attendees.forEach(name -> System.out.println("\nWelcome to the event, " + name));
   }
}
