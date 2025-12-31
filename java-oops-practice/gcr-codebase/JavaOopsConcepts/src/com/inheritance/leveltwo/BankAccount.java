package com.inheritance.leveltwo;

public class BankAccount {
	
	    String accountNumber;
	    double balance;

	    //Constructor
	    BankAccount(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    //Common method
	    void displayAccountType() {
	        System.out.println("Generic Bank Account");
	    }
	}

