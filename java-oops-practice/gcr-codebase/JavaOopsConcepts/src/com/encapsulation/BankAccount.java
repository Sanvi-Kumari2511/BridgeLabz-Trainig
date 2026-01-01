package com.encapsulation;

abstract class BankAccount {
	private String accountNumber;
	private String holderName;
	protected double balance;
	
	//Constructor
	BankAccount(String accountNumber, String holderName, double balance){
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	//Concrete methods
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount: " + amount);
        }
    }

    public void withdraw(double amount) {
    	
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount);
        } 
        else {
            System.out.println("Your balance is insufficient");
        }
    }
    
    //Abstract method
    public abstract double calculateInterest();
    
    //Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
 
}
