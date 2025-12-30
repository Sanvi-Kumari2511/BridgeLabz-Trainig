package com.designprinciples.levelone;
import java.util.ArrayList;

public class Bank {
	
	    private String bankName;
	    private ArrayList<Customer> customers;

	    // Constructor
	    public Bank(String bankName) {
	        this.bankName = bankName;
	        customers = new ArrayList<>();
	    }

	    // Method to open account for customer
	    public Account openAccount(Customer customer, double initialBalance) {
	        Account account = new Account(this, initialBalance);
	        customer.addAccount(account);
	        customers.add(customer);
	        System.out.println("Account opened in " + bankName + " for " + customer.getName());
	        return account;
	    }

	    public String getBankName() {
	        return bankName;
	    }
	}


