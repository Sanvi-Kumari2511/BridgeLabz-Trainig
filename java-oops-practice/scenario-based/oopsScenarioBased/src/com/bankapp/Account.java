package com.bankapp;

public class Account implements AccountOperation{
   double balance;
   private int accountNumber;
   
   //Cunstructor
   Account(double balance, int accountNumber){
	   this.balance = balance;
	   this.accountNumber = accountNumber;
   }
	    //Helper Method
	    protected boolean validateAmount(double amount) {
	        return amount > 0;
	    }
        
	    //Method to deposit money
	    public void deposit(double amount) {
	        if (validateAmount(amount)) {
	            balance += amount;
	            System.out.println("Deposited amount is: " + amount);
	        }
	    }
        
	    //Method to withdraw money
	    public void withdraw(double amount) {
	        if (validateAmount(amount) && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn amount is: " + amount);
	        }  
	        else {
	            System.out.println("Your balance is insufficient");
	        }
	    }
	}

   
   
