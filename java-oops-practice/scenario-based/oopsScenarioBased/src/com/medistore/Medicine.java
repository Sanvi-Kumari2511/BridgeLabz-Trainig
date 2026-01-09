package com.medistore;
import java.time.LocalDate;

 class Medicine implements ISellable {
	
	     private String name;
	     private double price;          
	     private int quantity;          
	     protected LocalDate expiryDate; 

	     //Constructor with default quantity
	     public Medicine(String name, double price, LocalDate expiryDate) {
	         this(name, price, expiryDate, 60);
	     }

	     public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
	         this.name = name;
	         this.price = price;
	         this.expiryDate = expiryDate;
	         this.quantity = quantity;
	     }

	     //Operator usage
	     public double calculateTotal(int qty) {
	         return price * qty; 
	     }

	     private double applyDiscount(double total) {
	         return total - (total * 0.20); 
	     }

	     //Override
	     public void sell(int qty) {
	    	 
	         if (qty <= quantity && !checkExpiry()) {
	             double total = calculateTotal(qty);
	             total = applyDiscount(total);
	             quantity -= qty;
	             
	             System.out.println(name + " sold. Bill: ₹" + total);
	         } 
	         
	         else {
	             System.out.println("Cannot sell medicine.");
	         }
	     }

	     //Override
	     public boolean checkExpiry() {
	         return LocalDate.now().isAfter(expiryDate);
	     }
	 }
