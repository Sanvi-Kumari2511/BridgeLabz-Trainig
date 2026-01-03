package com.mybank;
//Main class to test MyBank application
public class MyBankApp {
	
	    public static void main(String[] args) {

	        //Account reference (Polymorphysm)
	        Account acc1 = new SavingsAccount("SB1001", 100000);
	        Account acc2 = new CurrentAccount("CA2001");

	        //Transactions on Savings Account
	        acc1.deposit(5000);
	        acc1.calculateInterest();
	        System.out.println("\nSavings Account Balance: " + acc1.checkBalance());

	        //Transactions on Current Account
	        acc2.deposit(5000);
	        acc2.withdraw(3000);
	        acc2.calculateInterest();
	        System.out.println("\nCurrent Account Balance: " + acc2.checkBalance());
	    }
	}

