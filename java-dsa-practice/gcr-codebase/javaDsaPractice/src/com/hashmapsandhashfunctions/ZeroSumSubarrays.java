package com.hashmapsandhashfunctions;
import java.util.*;
;

public class ZeroSumSubarrays {

	    //Method to find and print all zero-sum subarrays
	    public static void findZeroSumSubarrays(int[] arr) {

	        // HashMap to store cumulative sum and list of indices
	        Map<Integer, List<Integer>> map = new HashMap<>();

	        int sum = 0;

	        //Adding sum 0 with index -1 
	        map.put(0, new ArrayList<>(List.of(-1)));

	        //Traversing array
	        for (int i = 0; i < arr.length; i++) {

	            // Update cumulative sum
	            sum += arr[i];

	            //If sum already exists, zero-sum subarray found
	            if (map.containsKey(sum)) {
	                for (int startIndex : map.get(sum)) {
	                    System.out.println("Zero-sum subarray found from index " + (startIndex + 1) + " to " + i);
	                }
	            }

	            //Storing current index for this sum
	            map.putIfAbsent(sum, new ArrayList<>());
	            map.get(sum).add(i);
	        }
	    }
	}
