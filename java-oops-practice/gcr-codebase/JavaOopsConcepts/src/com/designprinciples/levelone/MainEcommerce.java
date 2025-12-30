package com.designprinciples.levelone;

public class MainEcommerce {

	    public static void main(String[] args) {

	        // Products exist independently
	        Product p1 = new Product(101, "Keyboard", 1000);
	        Product p2 = new Product(102, "Mouse", 800);
	        Product p3 = new Product(103, "Headphone", 2000);

	        CustomerEcommerce customer = new CustomerEcommerce("Sanvi");

	        Order order1 = new Order(1);
	        order1.addProduct(p1);
	        order1.addProduct(p2);

	        Order order2 = new Order(2);
	        order2.addProduct(p3);

	        customer.placeOrder(order1);
	        customer.placeOrder(order2);

	        System.out.println();
	        customer.viewOrders();
	    }
	}

