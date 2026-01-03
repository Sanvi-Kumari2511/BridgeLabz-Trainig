package com.mybank;

 class SavingsAccount extends Account {
	
	     //Interest of 4%
	     private final double interestRate = 4.0;

	     public SavingsAccount(String accountNumber, double balance) {
	         super(accountNumber, balance);
	     }

	     //Polymorphic interest calculation (Override)
	     public void calculateInterest() {
	         double interest = checkBalance() * interestRate / 100;
	         setBalance(checkBalance() + interest);
	     }
	 }

