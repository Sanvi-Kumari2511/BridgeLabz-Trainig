package com.swiftcart;
abstract class Product {
	
   protected String name;
   protected double price;
   protected String category;
   
   //Constructor to access the product details
   Product(String  name, double price, String category){
	   this.name = name;
	   this.price = price;
	   this.category = category;
   }

	    abstract double getDiscount();   
	}

	   
   
