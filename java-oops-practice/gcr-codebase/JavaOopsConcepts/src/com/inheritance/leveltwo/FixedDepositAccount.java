package com.inheritance.leveltwo;

class FixedDepositAccount extends BankAccount{
	
	    int tenure; 

	    FixedDepositAccount(String accountNumber, double balance, int tenure) {
	        super(accountNumber, balance);
	        this.tenure = tenure;
	    }

	    //Override
	    void displayAccountType() {
	        System.out.println("Account Type: Fixed Deposit Account");
	        System.out.println("Tenure: " + tenure + " years");
	    }
	}


