package com.ewalletapplication;

 abstract class Wallet implements Transfferable  {

		    private double balance;   
		    
		    //Normal wallet
		    Wallet(double balance) {
		        this.balance = balance;
		    }

		    //Overloaded constructor with referral bonus
		    Wallet(double balance, double referralBonus) {
		        this.balance = balance + referralBonus;
		    }

		    protected boolean hasSufficientBalance(double amount) {
		        return balance >= amount;
		    }

		    protected void debit(double amount) {
		        balance -= amount;
		    }

		    protected void credit(double amount) {
		        balance += amount;
		    }
            
		    //Public getter for balance
		    public double getBalance() {
		        return balance;
		    }
		}

