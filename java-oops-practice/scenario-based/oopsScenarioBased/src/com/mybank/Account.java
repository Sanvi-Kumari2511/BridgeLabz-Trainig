package com.mybank;


/* 7. "MyBank – Managing Customer Accounts"
Story: You're building the core banking module for MyBank, a digital-first bank. Your job is to
manage customer accounts, deposits, and interest calculations.
Requirements:
● Account (base class): fields like accountNumber, balance.
● Derived classes: SavingsAccount, CurrentAccount (using inheritance).
● ITransaction interface: deposit(), withdraw(), checkBalance().
● Use constructors for account initialization with or without an opening balance.
● Encapsulation: balance must be private and only modifiable through methods.
● Use operators for interest: balance * interestRate / 100.
● Polymorphism in calculateInterest() – varies by account type.
● Use access modifiers: protect account data, expose only required operations. */

abstract class Account implements ITransaction {
	protected String accountNumber;
	protected double balance;
    
	//Constructor to access the account details
	Account(String accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//Constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    //Deposit method (Override)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    //Withdraw method (Override)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } 
        else {
            System.out.println("Insufficient balance!");
        }
    }

    //Check balance method (Override)
    public double checkBalance() {
        return balance;
    }

    //Setter used internally for interest update
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract method for interest calculation
    public abstract void calculateInterest();
  }

