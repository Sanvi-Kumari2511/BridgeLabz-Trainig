package com.restaurantorderingsystem;

public class FoodLoopApp {
   public static void main(String args []) {
	
	           //Creating food items
	           FoodItem item1 = new VegItem("Paneer Burger", 200, 4);
	           FoodItem item2 = new NonVegItem("Cheeze-Corn Pizza", 400, 2);
	           FoodItem item3 = new VegItem("French Fries", 150, 3);

	           //Creating a new order (custom combo)
	           Order order = new Order();

	           //Adding items to the order
	           order.addItem(item1);
	           order.addItem(item2);
	           order.addItem(item3);

	           //Placing the order
	           order.placeOrder();
	       }
	   }

   
