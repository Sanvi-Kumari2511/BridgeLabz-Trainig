package com.inheritance.leveltwo;

public class MainOrder {
	    public static void main(String[] args) {

	        Order order = new Order("ORD101", "31-12-2025");
	        ShippedOrder shipped = new ShippedOrder("ORD102", "01-01-2026", "TRK789");
	        DeliveredOrder delivered = new DeliveredOrder("ORD103", "03-01-2025", "TRK456", "06-01-2025");

	        System.out.println(order.getOrderStatus());
	        System.out.println(shipped.getOrderStatus());
	        System.out.println(delivered.getOrderStatus());
	    }
	}

