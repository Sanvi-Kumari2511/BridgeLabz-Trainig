package com.swiftcart;

 class NonPerishableProduct extends Product{

		    NonPerishableProduct(String name, double price) {
		        super(name, price, "Non-Perishable");
		    }

		    //Override
		    double getDiscount() {
		        return price * 0.10;   
		    }
		}

