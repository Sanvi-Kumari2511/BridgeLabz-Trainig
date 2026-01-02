package com.bankapp;

public class MainAccount {
	
	    public static void main(String[] args) {

	        Customer c1 = new Customer("Sanvi", 101);

	        Account acc1 = new SavingsAccount(12000, 523400, 5);
	        acc1.deposit(5000);
	        acc1.withdraw(3000);

	        SavingsAccount sa = (SavingsAccount) acc1;
	        sa.calculateInterest();

	        Account acc2 = new CurrentAccount(2001, 3000, 2000);
	        acc2.withdraw(4500);
	    }
	}

