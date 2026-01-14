package com.utilitybillpaymentsystem;
import java.time.LocalDate;

public abstract class Bill implements IPayable {
	
	private String type;
	private double amount;
	private LocalDate dueDate;
    private boolean isPaid;
    
    
    //Constructor to initialize bill details
    public Bill(String type, double amount, LocalDate dueDate) {
    	this.type = type; 
    	this.amount = amount;
    	this.dueDate = dueDate;
    	this.isPaid = false;
    }
    
    //Getter method to get payment status
    public boolean getPaymentStatus() {
    	return isPaid;
    }
    
    //Protected method to mark the bill as paid
    protected void markAsPaid() {
    	this.isPaid = true;
    }
    
    //Getter method to get the amount
    public double getAmount() {
    	return amount;
    }
    
    
    //Getter method to get the due date
    public LocalDate getDueDate() {
    	return dueDate;
    }
    
    //Method to calculate late fine
    public double calculateLateFee(double fine) {
    	return amount + fine;
    }
    
    //Override
    public void pay() {
    	if(!isPaid) {
    		markAsPaid();
    		
    		System.out.println(type + " bill paid " + " Rs " + amount);
    	}
    	
    	else {
    		System.out.println(type + " bill is already paid");
    	}
    }
    
    //Override
    public abstract void sendReminder();
}
