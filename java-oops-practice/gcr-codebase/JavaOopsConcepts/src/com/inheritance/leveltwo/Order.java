package com.inheritance.leveltwo;

public class Order {
	
	    String orderId;
	    String orderDate;

	    //Constructor
	    Order(String orderId, String orderDate) {
	        this.orderId = orderId;
	        this.orderDate = orderDate;
	    }

	    //Creating a method to get order status
	    String getOrderStatus() {
	        return "Placed Order";
	    }
	}


