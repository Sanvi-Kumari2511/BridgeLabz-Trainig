package com.stackandqueue;

public class MainCircularTourProblem {

	    public static void main(String[] args) {

	        //Petrol available at each pump
	        int[] petrol = {6, 10, 5, 4};

	        //Distance to next petrol pump
	        int[] distance = {4, 3, 6, 8};

	        //Finding starting petrol pump
	        int startPump = CircularTourProblem.findStartingPump(petrol, distance);

	        //Displaying results
	        if (startPump == -1) {
	            System.out.println("Circular tour not possible");
	        } 
	        else {
	            System.out.println("Start at petrol pump index: " + startPump);
	        }
	    }
	}

