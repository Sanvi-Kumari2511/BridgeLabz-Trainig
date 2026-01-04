package com.hashmapsandhashfunctions;

public class MainTwoSumProblem {
	
	    public static void main(String[] args) {

	        int[] nums = {2, 7, 11, 15};
	        int target = 9;

	        int[] result = TwoSumProblem.findTwoSum(nums, target);

	        System.out.println("Index 1: " + result[0]);
	        System.out.println("Index 2: " + result[1]);
	    }
	}


