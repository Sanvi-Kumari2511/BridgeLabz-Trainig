package com.bankapp;

public class Customer {
    private String name;
    private int id;
    
    //Constructor of Customer class
    Customer(String name, int id){
    	this.name = name;
    	this.id = id;
    }
    
    public String getName() {
    	return name;
    }
}
