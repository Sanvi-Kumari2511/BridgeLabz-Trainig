package com.bankapp;

class SavingsAccount extends Account {
	private double interestRate;
	
	//constructor
	SavingsAccount (double balance, int accountNumber, double interestRate) {
		super(balance, accountNumber);
		this.interestRate = interestRate;
	}
	
	//Helper Method
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
	
    
}
