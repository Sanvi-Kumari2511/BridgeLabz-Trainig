package com.encapsulation;

 class NonVegItem extends FoodItem implements Discountable {
	 private static final double extraCharge = 50; 

	    public NonVegItem(String itemName, double price, int quantity) {
	        super(itemName, price, quantity);
	    }

	    //Override
	    public double calculateTotalPrice() {
	        return (getPrice() * getQuantity()) + (extraCharge * getQuantity());
	    }

	    //Override
	    public double applyDiscount() {
	        return calculateTotalPrice() * 0.05; 
	    }

	    //Override
	    public String getDiscountDetails() {
	        return "5% discount on Non-Veg items";
	    }
}
