package com.dailysalessummaryreports;
import java.util.*;

public class Transaction {
    String date;
    double amount;
    
    //Constructor to initialize transaction details
    Transaction(String date, double amount){
    	this.date = date;
    	this.amount = amount;
    }
    
    //Method to display transaction details
    void display() {
    	System.out.println("Date: " + date + " Amount: " + amount);
    }
}
