package com.ewalletapplication;

public class Transaction {

	    private String sender;
	    private String receiver;
	    private double amount;

	    //Constructor
	    Transaction(String sender, String receiver, double amount) {
	        this.sender = sender;
	        this.receiver = receiver;
	        this.amount = amount;
	    }

	    //Displaying transaction details
	    public void showTransaction() {
	        System.out.println(sender + " transferred " + amount + " to " + receiver);
	    }
	}

