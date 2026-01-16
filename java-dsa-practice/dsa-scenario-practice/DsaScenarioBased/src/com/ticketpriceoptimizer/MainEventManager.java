package com.ticketpriceoptimizer;
import java.util.*;

public class MainEventManager {
   public static void main(String args []) {
	   Scanner sc = new Scanner(System.in);
	   
	   //Taking input from users
	   System.out.print("Enter number of tickets: ");
	    int number = sc.nextInt();
	    
	    Ticket[] tickets = new Ticket[number];
	    
	    //Taking ticket details from user
	    for(int i= 0; i < number; i++) {
	    	System.out.println("\nEnter details for Ticket " + (i + 1));
	    	
	    	System.out.print("Ticket ID: ");
	    	int id = sc.nextInt();
	    	
	    	System.out.print("Ticket Price: ");
	    	double price = sc.nextDouble();
	    	
	    	tickets[i] = new Ticket(id, price);
	    }
	    
	    //Displaying tickets before sorting
	    System.out.println("\nBefore Sorting: ");
	    
	    for(Ticket t : tickets) {
	    	t.display();
	    }
	    
	    //Applying quick sort
	    EventManager.quickSort(tickets,  0,  number - 1);
	    
	    //Displaying tickets after sorting
	    System.out.println("\nAfter Sorting (By Price): ");
	    for(Ticket t : tickets) {
	    	t.display();
	    }
   }
}
