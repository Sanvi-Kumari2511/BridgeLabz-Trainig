package com.designprinciples.levelone;

public class Account {
	
	    private Bank bank;
	    private double balance;

	    // Constructor
	    public Account(Bank bank, double balance) {
	        this.bank = bank;
	        this.balance = balance;
	    }

	    public void showBalance() {
	        System.out.println("Bank: " + bank.getBankName() +
	                           ", Balance: ₹" + balance);
	    }
	}


