package com.customerqueuemanager;
import java.util.*;

public class CallCenter {
    
	//Queue for managing incoming calls
	private Queue<Customer> normalQueue = new LinkedList<>();
	
	//Priority queue for managing VIP customers
	private PriorityQueue<Customer> vipQueue = new PriorityQueue<>(Comparator.comparing(Customer::getName));
	
	//HashMap for storing customer data
	private  HashMap<String, Integer> callHistory = new HashMap<>();
	
	//Adding a new call
    public void addCall(Customer customer) {
		callHistory.put(customer.getName(), callHistory.getOrDefault(customer.getName(), 0)+1);
		if(customer.isVIP()){
			
			vipQueue.offer(customer);
            System.out.println("\nAdded VIP call: " + customer.getName());
        } 
		else {
			
            normalQueue.offer(customer);
            System.out.println("Added regular call: " + customer.getName());
         }
	}
	
	//Adding next customers
	public void nextCustomer() {
		Customer customer;
		
        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
        }
        
        else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
        } 
        
        else {
            System.out.println("No customers in queue");
            return;
        }
        
        System.out.println("Next customer: " + customer);
    }
	
	
	//Method to display queues
	public void displayQueues() {
		
        System.out.println("VIP Queue: " + vipQueue);
        
        System.out.println();
        
        System.out.println("Normal Queue: " + normalQueue);
        
        System.out.println();
    }

	//Method to display call history
    public void displayCallHistory() {
    	
        System.out.println("Call History:");
        
        for (Map.Entry<String, Integer> entry : callHistory.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " calls");
 
        }
    }
}
