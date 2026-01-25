package com.javajunit.advancedproblems.banktransactiontesting;

public class BankAccount {
	private double balance;

    //Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //Method to deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        balance += amount;
    }

    //Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }
        
        balance -= amount;
    }

    //Method to get current balance
    public double getBalance() {
        return balance;
    }
}
