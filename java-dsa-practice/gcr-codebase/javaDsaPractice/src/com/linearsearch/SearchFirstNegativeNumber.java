package com.linearsearch;

public class SearchFirstNegativeNumber {

	    //Method to find index of first negative number
	    public static int findFirstNegative(int[] arr) {

	        //Traversing the array using linear search
	        for (int i = 0; i < arr.length; i++) {

	            //Checking if current element is negative
	            if (arr[i] < 0) {
	                return i; 
	            }
	        }

	        //If no negative number is found
	        return -1;
	    }

	    public static void main(String[] args) {

	        int[] numbers = {1, 4, 3, -5, 6};

	        int index = findFirstNegative(numbers);

	        if (index != -1) {
	            System.out.println("First negative number found at index: " + index);
	        } 
	        else {
	            System.out.println("No negative number found in the array");
	        }
	    }
	}

