package com.ewalletapplication;

public class BusinessWallet extends Wallet {

	    //Transaction tax of 2%
	    private double transactionTax = 0.02;

	    //Constructor
	    BusinessWallet(double balance) {
	        super(balance);
	    }

	    
	    //Override
	    public void transferTo(User receiver, double amount) {

	        //Calculating tax
	        double tax = amount * transactionTax;

	        
	        double totalDeduction = amount + tax;

	        if (hasSufficientBalance(totalDeduction)) {

	            
	            debit(totalDeduction);

	            // Credit receiver (only amount)
	            receiver.getWallet().credit(amount);

	            System.out.println("Business wallet transfer successful");
	        } 
	           else {
	            System.out.println("Insufficient balance in your business wallet");
	        }
	    }
	}

