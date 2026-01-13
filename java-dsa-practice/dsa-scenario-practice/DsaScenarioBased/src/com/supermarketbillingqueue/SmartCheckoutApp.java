package com.supermarketbillingqueue;

public class SmartCheckoutApp {
	 public static void main(String[] args) {

	        SmartCheckout checkout = new SmartCheckout();

	        //Adding items to store
	        checkout.addItemToStore("Cake", 50, 20);
	        checkout.addItemToStore("Bread", 60, 30);
	        checkout.addItemToStore("Milk", 80, 25);

	        //Creating customers
	        Customer c1 = new Customer("Sanvi");
	        c1.addItem("Milk", 3);
	        c1.addItem("Bread", 2);

	        Customer c2 = new Customer("Shivani");
	        c2.addItem("Milk", 2);
	        c2.addItem("Cake", 1);

	        //Adding customers to queue
	        checkout.addCustomer(c1);
	        checkout.addCustomer(c2);

	        //Process customers
	        checkout.processCustomer();
	        checkout.processCustomer();

	        //Showing remaining stock
	        checkout.showStock();
	    }
}
