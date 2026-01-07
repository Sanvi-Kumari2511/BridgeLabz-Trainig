package com.bookbazar;

public class DigitalBookStoreSystem {
	
	    public static void main(String[] args) {

	        //Creating books
	        Book ebook = new EBook("Java Basics", "James Gosling", 600, 20);
	        Book printedBook = new PrintedBook("OOP in Java", "Herbert Schildt", 800, 10);

	        //Creating orders
	        Order order1 = new Order("Sanvi", ebook, 2);
	        Order order2 = new Order("Sandip", printedBook, 1);

	        //Placing orders
	        order1.placeOrder();
	        order2.placeOrder();

	        //Displaying order details
	        System.out.println("Order 1 Status: " + order1.getOrderStatus());
	        System.out.println("Order 1 Total Cost: " + order1.calculateTotalCost());

	        System.out.println("Order 2 Status: " + order2.getOrderStatus());
	        System.out.println("Order 2 Total Cost: " + order2.calculateTotalCost());
	    }
	}
