package com.inheritance.leveltwo;

public class MainBankAccount {
	
	    public static void main(String[] args) {

	        BankAccount acc1 = new SavingsAccount("SB101", 60000, 5.0);

	        BankAccount acc2 = new CheckingAccount("CA202", 40000, 30000);

	        BankAccount acc3 = new FixedDepositAccount("FD303", 200000, 5);

	        acc1.displayAccountType();
	        System.out.println();

	        acc2.displayAccountType();
	        System.out.println();

	        acc3.displayAccountType();
	    }
	}


