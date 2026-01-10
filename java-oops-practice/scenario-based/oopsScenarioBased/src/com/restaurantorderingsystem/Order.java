package com.restaurantorderingsystem;
import java.util.ArrayList;

public class Order implements IOrderable{
 
        //List off food items
	    private ArrayList<FoodItem> items; 
	    private double total;      
	    
	    //Constructor to create a custom combo meal
	    public Order() {
	        items = new ArrayList<>();
	        total = 0;
	    }

	    //Add item to the order
	    public void addItem(FoodItem item) {
	        if (item.isAvailable()) {      
	            items.add(item);           
	            item.reduceStock();        
	        } 
	        else {
	            System.out.println(item.name + " is out of stock");
	        }
	    }

	    //Applying discount based on order total 
	    public double applyDiscount() {
	        if (total >= 500) {
	            return total * 0.10;       
	        } 
	        else if (total >= 300) {
	            return total * 0.05;      
	        }
	        return 0;                    
	    }

	    //Placing the order (Override)
	    public void placeOrder() {
	        total = 0;

	        //Calculating total using operator
	        for (FoodItem item : items) {
	            total += item.getPrice(); 
	        }

	        double discount = applyDiscount(); 
	        total = total - discount;          

	        System.out.println("Order placed successfully!");
	        System.out.println("Discount Applied: ₹" + discount);
	        System.out.println("Total Amount: ₹" + total);
	    }

	    // Cancel the order( Override)
	    public void cancelOrder() {
	        items.clear();                 
	        System.out.println("Order cancelled");
	    }
	}

