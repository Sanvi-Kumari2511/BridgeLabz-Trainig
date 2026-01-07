package com.loanbuddy;

public class LoanBuddyApp {

	    public static void main(String[] args) {

	        //Creating applicant object
	        Applicant applicant = new Applicant(
	                "Sanvi",
	                720,
	                60000,
	                500000
	        );

	        //Reference of parent class (Polymorphism)
	        LoanApplication loan = new HomeLoan(applicant, 200);

	        //Loan approval check
	        if (loan.approveLoan()) {
	            System.out.println("Loan Approved ");
	            System.out.println("Monthly EMI: " +
	                    String.format("%.2f", loan.calculateEMI()));
	        } 
	        else {
	            System.out.println("Loan Rejected ❌");
	        }
	  }
}
	
