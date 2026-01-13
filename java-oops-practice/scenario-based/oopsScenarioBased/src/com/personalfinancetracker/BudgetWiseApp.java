package com.personalfinancetracker;
import java.util.*;


public class BudgetWiseApp {
	
	    public static void main(String[] args) {

	    	        //Monthly category limits
	    	        Map<String, Double> monthlyLimits = new HashMap<>();
	    	        monthlyLimits.put("Food", 1000.0);
	    	        monthlyLimits.put("Transport", 500.0);
	    	        monthlyLimits.put("Game", 250.0);

	    	        //Create MonthlyBudget
	    	        MonthlyBudget mb = new MonthlyBudget(3000, monthlyLimits);
	    	        mb.addTransaction(new Transaction(700, "expense", "Food", new Date()));
	    	        mb.addTransaction(new Transaction(200, "expense", "Transport", new Date()));
	    	        mb.addTransaction(new Transaction(150, "expense", "Game", new Date()));
	    	        mb.addTransaction(new Transaction(600, "income", "Salary", new Date()));

	    	        //Generate report and detect overspending
	    	        mb.generateReport();
	    	        mb.detectOverspend();

	    	        System.out.println("\n============ Annual Budget ============");
	    	        
                    System.out.println();
                    
	    	        //AnnualBudget demo
	    	        AnnualBudget ab = new AnnualBudget(24000, monthlyLimits); 
	    	        ab.addTransaction(new Transaction(5000, "expense", "Food", new Date()));

	    	        ab.generateReport();
	    	        ab.detectOverspend();
	    	    }
	    	}
