package com.bankapp;

class CurrentAccount extends Account{
   double overdraftLimit;
   
   //Constructor
   CurrentAccount (double balance, int accountNumber, double overdraftLimit){
	   
	   super(balance, accountNumber);
	   this.overdraftLimit = overdraftLimit;
   }
   // Polymorphism
    public void withdraw(double amount) {
    	
       if (validateAmount(amount) && amount <= balance + overdraftLimit) {
           balance -= amount;
           
           System.out.println("Withdrawn money using overdraft: " + amount);
       } 
       else {
           System.out.println("Overdraft limit is greater");
       }
   }
}
   
