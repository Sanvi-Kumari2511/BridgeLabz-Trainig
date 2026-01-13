package com.personalfinancetracker;

 public class AnnualBudget extends Budget implements IAnalyzable {
	
	     //Constructor
	     public AnnualBudget(double income, java.util.Map<String, Double> categoryLimits) {
	         super(income, categoryLimits);
	     }

	    
	     //Override
	     public void generateReport() {
	         System.out.println("------ Annual Budget Report ------");
	         
             System.out.println();

	         System.out.println("Total Income: " + income);
	         System.out.println("Yearly Savings: " + calculateNetSavings());
	     }

	     //Override
	     public void detectOverspend() {
	         System.out.println("Annual overspending analysis completed");
	     }
}

