package com.streamapi.emailnotification;

import java.util.List;
import java.util.ArrayList;

public class EmailNotification {
  public static void main(String args []) {
	  
	  //Creating a list of user emails
	  List<String> emails = new ArrayList<>();
	   emails.add("sanvi@123gmail.com");
	   emails.add("shivani09@gmail.com");
	   emails.add("annu17@gmail.com");
	   
	   emails.forEach(email -> sendEmailNotification(email));
	   
  }
  
  public static void sendEmailNotification(String email) {
	  System.out.println("\nNotification sent to: " + email);
  }
}
