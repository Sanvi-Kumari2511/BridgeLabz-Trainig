package com.swiftcart;

 class PerishableProduct extends Product{
	
	    PerishableProduct(String name, double price) {
	        super(name, price, "Perishable");
	    }

	    //Override
	    double getDiscount() {
	        return price * 0.05;   
	    }
	}
