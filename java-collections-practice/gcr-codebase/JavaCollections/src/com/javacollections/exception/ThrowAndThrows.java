package com.javacollections.exception;

public class ThrowAndThrows {
	
	//Method that validates input and propagates exception
    static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        if (amount < 0 || rate < 0) {
            //throw is used to create the exception
            throw new IllegalArgumentException();
        }

        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {

        try {
        	
            double interest = calculateInterest(20000, 5, 2);
            System.out.println("Calculated Interest: " + interest);

        } 
        
        catch (IllegalArgumentException e) {
            //Exception handled here
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
