package com.hashmapsandhashfunctions;

public class MainPairWithGivenSum {
	
	    public static void main(String[] args) {

	        //Input array
	        int[] arr = {8, 7, 2, 5, 3, 1};

	        //Target sum
	        int target = 6;

	        //Checking for pair
	        boolean result = PairWithGivenSum.hasPairWithSum(arr, target);

	        if (!result) {
	            System.out.println("No pair found with given sum");
	        }
	    }
	}

