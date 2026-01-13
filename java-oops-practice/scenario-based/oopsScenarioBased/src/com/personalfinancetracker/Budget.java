package com.personalfinancetracker;
import java.util.*;

abstract class Budget {
	
	    protected double income;                         
	    protected Map<String, Double> categoryLimits;    
	    protected List<Transaction> transactions;       

	    
	    //Constructor initializes income and category limits
	    public Budget(double income, Map<String, Double> categoryLimits) {
	    	
	        this.income = income;
	        this.categoryLimits = new HashMap<>(categoryLimits);
	        this.transactions = new ArrayList<>();
	    }

	    
	    //Encapsulation: Add a transaction safely 
	    public void addTransaction(Transaction t) {
	        transactions.add(t);
	    }

	    //Calculating net savings = income - total expenses
	    public double calculateNetSavings() {
	        double totalExpenses = 0;
	        for (Transaction t : transactions) {
	            if (t.getType().equalsIgnoreCase("expense")) {
	                totalExpenses += t.getAmount();
	            }
	        }
	        
	        return income - totalExpenses;
	    }

	    
	    //Abstract methods to be implemented by subclasses
	    public abstract void generateReport();
	    public abstract void detectOverspend();
} 
