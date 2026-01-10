package com.restaurantorderingsystem;

public class FoodItem {
   protected String name;
   protected String category;
   protected double price;
   private int stock;
   
   //Constructor to initialize the food items
   FoodItem(String name, String category, double price, int stock){
	   this.name = name;
	   this.category = category;
	   this.price = price;
	   this.stock = stock;
   }
   
   //Getter for price
   public double getPrice() {
       return price;
   }

   //Check if item is available 
   protected boolean isAvailable() {
       return stock > 0;
   }

   //Reduce stock after adding item to order
   protected void reduceStock() {
       stock--;
   }
}
