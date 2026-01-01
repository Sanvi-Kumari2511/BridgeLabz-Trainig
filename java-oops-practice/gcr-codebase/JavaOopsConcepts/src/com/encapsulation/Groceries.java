package com.encapsulation;

 class Groceries extends Product {


	    public Groceries(int productId, String name, double price) {
	        super(productId, name, price);
	    }

	    //Override
	    public double calculateDiscount() {
	        return price * 0.05; 
	    }
	}

