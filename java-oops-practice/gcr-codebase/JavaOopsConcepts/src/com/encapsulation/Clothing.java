package com.encapsulation;

 class Clothing extends Product implements Taxable {
	
	    public Clothing(int productId, String name, double price) {
	        super(productId, name, price);
	    }

	    //Override
	    public double calculateDiscount() {
	        return price * 0.20; 
	    }

	    //Override
	    public double calculateTax() {
	        return price * 0.05; 
	    }

	    //Override
	    public String getTaxDetails() {
	        return "5% GST on Clothing";
	    }
	    
	}

