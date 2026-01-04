package com.hashmapsandhashfunctions;
import java.util.HashMap;

public class TwoSumProblem {
	
	    public static int[] findTwoSum(int[] arr, int target) {

	        HashMap<Integer, Integer> map = new HashMap<>();

	        for (int i = 0; i < arr.length; i++) {

	            int needed = target - arr[i];

	            //If required number already seen
	            if (map.containsKey(needed)) {
	                return new int[] { map.get(needed), i };
	            }

	            //Storing current number with index
	            map.put(arr[i], i);
	        }

	        
	        //No solution
	        return new int[] { -1, -1 }; 
	    }
	}
