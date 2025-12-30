package com.designprinciples.levelone;
import java.util.ArrayList;

public class CustomerEcommerce {
	
	    private String customerName;
	    private ArrayList<Order> orders;

	    public CustomerEcommerce(String customerName) {
	        this.customerName = customerName;
	        orders = new ArrayList<>();
	    }

	    // Communication: customer places order
	    public void placeOrder(Order order) {
	        orders.add(order);
	        System.out.println(customerName + " placed an order");
	    }

	    public void viewOrders() {
	        System.out.println("Orders placed by " + customerName + ":");
	        for (Order o : orders) {
	            o.showOrderDetails();
	            System.out.println();
	        }
	    }
	}

