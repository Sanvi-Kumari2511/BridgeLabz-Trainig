package com.designprinciples.levelone;

public class MainBank {
	
	    public static void main(String[] args) {

	        Bank sbi = new Bank("SBI Bank");

	        Customer customer1 = new Customer("Sanvi");
	        Customer customer2 = new Customer("Rishabh");

	        sbi.openAccount(customer1, 4000);
	        sbi.openAccount(customer1, 10000);
	        sbi.openAccount(customer2, 6000);

	        System.out.println();
	        customer1.viewBalance();
	        System.out.println();
	        customer2.viewBalance();
	    }
	}

