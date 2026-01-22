package com.sortingmedicinesbyexpiry;

public class Medicine {
    String name; 
    int expiryDate;
    
    //Constructor to initialize the medicine detail
    public Medicine(String name, int expiryDate) {
    	this.name=name;
    	this.expiryDate=expiryDate;
    }
    
    //Override
    public String toString() {
    	return name + " -> Expiry Date: " + expiryDate;
    }
}
