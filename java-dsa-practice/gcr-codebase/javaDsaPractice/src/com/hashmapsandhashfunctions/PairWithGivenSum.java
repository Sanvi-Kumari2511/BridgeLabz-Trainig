package com.hashmapsandhashfunctions;
import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {

	    //Method to check for pair
	    public static boolean hasPairWithSum(int[] arr, int target) {

	        //HashMap to store visited numbers
	        Map<Integer, Integer> map = new HashMap<>();

	        //Traversing array
	        for (int num : arr) {

	            int required = target - num;

	            //Checking if required number exists
	            if (map.containsKey(required)) {
	                System.out.println("Pair found: " + required + " + " + num + " = " + target);
	                return true;
	            }

	            //Storing current number in map
	            map.put(num, 1);
	        }

	        return false;
	    }
	}

