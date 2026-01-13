package com.personalfinancetracker;
import java.util.Date;

public class Transaction {

	    private double amount;      
	    private String type;        
	    private String category;    
	    private Date date;          

	    //Constructor to initialize transaction
	    public Transaction(double amount, String type, String category, Date date) {
	        this.amount = amount;
	        this.type = type;
	        this.category = category;
	        this.date = date;
	    }

	    //Getters for encapsulated fields
	    public double getAmount() {
	    	return amount; 
	    	
	    }
	    public String getType() {
	    	return type; 
	    	
	    }
	    
	    public String getCategory() { 
	    	return category; 
	    	
	    }
	    public Date getDate() { 
	    	return date; 
	    }
	}
