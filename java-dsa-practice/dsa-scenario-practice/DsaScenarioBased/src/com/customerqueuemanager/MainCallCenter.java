package com.customerqueuemanager;

public class MainCallCenter {
   public static void main(String args []) {
	   
	   //Customers' details
	   CallCenter callCenter = new CallCenter();
	   Customer c1 = new Customer ("Sanvi", true);
	   Customer c2 = new Customer ("Sandip", false);
	   Customer c3 = new Customer ("Shivani", false);
	   Customer c4 = new Customer ("Ashutosh", true);
	   
	   //Calling customers
	   callCenter.addCall(c1);
	   callCenter.addCall(c2);
	   callCenter.addCall(c3);
	   callCenter.addCall(c4);
	   callCenter.addCall(c1);
	  
	  //Displaying queues and call history
	  System.out.println();
	  callCenter.displayQueues();
	  callCenter.displayCallHistory();
	  
	  System.out.println();
	  
	  //Serving next customers' details
	  System.out.println("\nServing next customers: ");
	  callCenter.nextCustomer();
	  callCenter.nextCustomer();
	  callCenter.nextCustomer();
	  callCenter.nextCustomer();
	  callCenter.nextCustomer();
	  
   }
}
