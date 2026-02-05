package com.collectors.orderrevenuesummary;

public class Order {
 
	private String customer;
	private double amount;
	
	//Constructor to initialize order details
	public Order(String customer, double amount) {
		this.customer = customer;
		this.amount = amount;
	}
	
	//Getter method to get customer
	public String getCustomer() {
		return customer;
	}
	
   //Getter method to get amount
	public double getAmount() {
		return amount;
	}
}
