package com.personalfinancetracker;
import java.util.*;

 public class MonthlyBudget extends Budget implements IAnalyzable {
	
	     // Constructor
	        public  MonthlyBudget(double income, Map<String, Double> categoryLimits) {
	         super(income, categoryLimits);
	     }

	     //Override
	     public void generateReport() {
	         System.out.println("------ Monthly Budget Report ------");
	         
	         System.out.println();
	         
	         System.out.println("Income: " + income);
	         System.out.println("Net Savings: " + calculateNetSavings());
	     }

	    
	     //Override
	     public void detectOverspend() {
	         Map<String, Double> spent = new HashMap<>();

	         //Calculating spending per category
	         for (Transaction t : transactions) {
	             if (t.getType().equalsIgnoreCase("expense")) {
	                 spent.put(
	                     t.getCategory(),
	                     spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount()
	                 );
	             }
	         }

	         //Comparing spending with limits
	         for (String category : spent.keySet()) {
	             if (spent.get(category) > categoryLimits.getOrDefault(category, 0.0)) {
	                 System.out.println("Overspending in category: " + category);
	             }
	         }
	   }
	     
 }


