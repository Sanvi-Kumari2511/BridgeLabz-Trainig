package com.supermarketbillingqueue;
import java.util.*;

public class Customer {
    private String customerName;
    
    //List of items in cart
    private List<Item> items;
    
    
    //Constructor
    Customer(String customerName){
    	this.customerName = customerName;
    	this.items = new ArrayList<>();
    }
    
    //Adding items to cart
    public void addItem(String itemName, int quantity) {
    	items.add(new Item(itemName, quantity));
    }
    
    public String getCustomerName() {
    	return customerName;
    }
    
    public List<Item> getItems(){
    	return items;
    }
}
