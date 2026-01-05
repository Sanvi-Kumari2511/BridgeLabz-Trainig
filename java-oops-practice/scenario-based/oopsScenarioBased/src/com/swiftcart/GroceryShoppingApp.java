package com.swiftcart;

public class GroceryShoppingApp {
	
	    public static void main(String[] args) {

	        Product p1 = new PerishableProduct("Rice", 50);
	        Product p2 = new NonPerishableProduct("Pulse", 100);

	        Cart cart = new Cart();

	        cart.addProduct(p1, 2);  
	        cart.addProduct(p2, 1);

	        cart.applyDiscount(15);   
	        cart.generateBill();
	    }
	}

