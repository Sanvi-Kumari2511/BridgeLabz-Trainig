package com.mybank;

 class CurrentAccount extends Account {
         //Interest of 1.5%
	     private final double interestRate = 1.5; 

	     public CurrentAccount(String accountNumber) {
	         super(accountNumber);
	     }

	     //Polymorphic interest calculation (Override)
	     public void calculateInterest() {
	         double interest = checkBalance() * interestRate / 100;
	         setBalance(checkBalance() + interest);
	     }
	 }
