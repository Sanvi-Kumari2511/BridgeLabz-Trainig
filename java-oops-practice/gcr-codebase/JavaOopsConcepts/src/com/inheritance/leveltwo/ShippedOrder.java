package com.inheritance.leveltwo;

class ShippedOrder extends Order {
	
	    String trackingNumber;

	    //Constructor
	    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
	        super(orderId, orderDate);
	        this.trackingNumber = trackingNumber;
	    }

	    //Override
	    String getOrderStatus() {
	        return "Order Shipped (Tracking No: " + trackingNumber + ")";
	    }
	}


