package com.encapsulation;

abstract class FoodItem {

	    //Encapsulated fields
	    private String itemName;
	    private double price;
	    private int quantity;

	    //Constructor
	    public FoodItem(String itemName, double price, int quantity) {
	        this.itemName = itemName;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    //Abstract method
	    public abstract double calculateTotalPrice();

	    //Concrete method
	    public void getItemDetails() {
	        System.out.println("Item Name: " + itemName);
	        System.out.println("Price: " + price);
	        System.out.println("Quantity: " + quantity);
	    }

	    protected double getPrice() {
	        return price;
	    }

	    protected int getQuantity() {
	        return quantity;
	    }

	    public String getItemName() {
	        return itemName;
	    }
	}

