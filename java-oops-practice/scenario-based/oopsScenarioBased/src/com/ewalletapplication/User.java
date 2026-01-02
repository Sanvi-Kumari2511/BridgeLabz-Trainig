package com.ewalletapplication;

public class User {
	
	    private String name;
	    private Wallet wallet;
        
	    //Constructor
	    User(String name, Wallet wallet) {
	        this.name = name;
	        this.wallet = wallet;
	    }

	    //Method to get name
	    public String getName() {
	        return name;
	    }
        
	    //Method to getWallet
	    public Wallet getWallet() {
	        return wallet;
	    }
	}

