package com.designprinciples.levelone;
import java.util.ArrayList;

public class Customer {
	
	    private String name;
	    private ArrayList<Account> accounts;

	    // Constructor
	    public Customer(String name) {
	        this.name = name;
	        accounts = new ArrayList<>();
	    }

	    public void addAccount(Account account) {
	        accounts.add(account);
	    }

	    public String getName() {
	        return name;
	    }

	    // View all account balances
	    public void viewBalance() {
	        System.out.println("Account details for " + name + ":");
	        for (Account account : accounts) {
	            account.showBalance();
	        }
	    }
	}


