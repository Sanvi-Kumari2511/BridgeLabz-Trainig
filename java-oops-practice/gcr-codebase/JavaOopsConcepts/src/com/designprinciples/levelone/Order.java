package com.designprinciples.levelone;
import java.util.ArrayList;

public class Order {
	
	    private int orderId;
	    private ArrayList<Product> products;

	    public Order(int orderId) {
	        this.orderId = orderId;
	        products = new ArrayList<>();
	    }

	    // Communication: add product to order
	    public void addProduct(Product product) {
	        products.add(product);
	    }

	    public void showOrderDetails() {
	        System.out.println("Order ID: " + orderId);
	        double total = 0;
	        for (Product p : products) {
	            p.displayProduct();
	            total += p.getPrice();
	        }
	        System.out.println("Total Amount: ₹" + total);
	    }
	}

