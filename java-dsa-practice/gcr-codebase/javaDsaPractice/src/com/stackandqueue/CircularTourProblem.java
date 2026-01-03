package com.stackandqueue;

public class CircularTourProblem {

	    //Method to find starting petrol pump index
	    public static int findStartingPump(int[] petrol, int[] distance) {

	        int start = 1;    
	        int balance = 0;  
	        int deficit = 0;  

	        //Traversing all petrol pumps
	        for (int i = 0; i < petrol.length; i++) {

	            //Updating petrol balance
	            balance += petrol[i] - distance[i];

	            //If balance becomes negative, tour fails
	            if (balance < 0) {
	                deficit += balance;   
	                start = i + 1;        
	                balance = 0;          
	            }
	        }

	        //Checking if total petrol is sufficient
	        if (balance + deficit >= 0) {
	            return start;
	        } 
	        else {
	            return -1;  
	        }
	    }
	}
