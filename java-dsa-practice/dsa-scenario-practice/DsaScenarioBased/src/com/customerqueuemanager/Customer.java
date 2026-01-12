package com.customerqueuemanager;

public class Customer {
    private String name;
    private boolean isVIP;
    
    //Constructor to get deatils of customer
    public Customer(String name, boolean isVIP){
    	this.name = name;
    	this.isVIP = isVIP;
    }
    
    //Method to get the name of a customer
    public String getName() {
        return name;
    }
    
    //Method to know the customer is VIP or not
    public boolean isVIP() {
    	return isVIP;
    }
    
    @Override
    public String toString() {
        return name + (isVIP ? " (VIP)" : "");
    }
}
