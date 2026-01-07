package com.bookbazar;

public class Order {

	    private String customerName;
	    private Book book;
	    private int quantity;

	    //Order status restricted from outside modification
	    private String orderStatus;

	    //Constructor to create an order
	    public Order(String customerName, Book book, int quantity) {
	        this.customerName = customerName;
	        this.book = book;
	        this.quantity = quantity;
	        this.orderStatus = "CREATED";
	    }

	    //Method to calculate total cost
	    public double calculateTotalCost() {

	        // price × quantity
	        double basePrice = book.price * quantity;

	        // Apply discount using polymorphism
	        double discount = book.applyDiscount(quantity);

	        // Final price calculation
	        return basePrice - discount;
	    }

	    // Process order internally
	    public void placeOrder() {

	        if (quantity <= book.getStock()) {
	            book.reduceStock(quantity);
	            updateOrderStatus("CONFIRMED");
	        } 
	        else {
	            updateOrderStatus("FAILED");
	        }
	    }

	    //Restricted method to update order status
	    private void updateOrderStatus(String status) {
	        this.orderStatus = status;
	    }

	    //Getter for order status
	    public String getOrderStatus() {
	        return orderStatus;
	    }
	}
