package com.hashmapsandhashfunctions;

public class MainLongestConsecutiveSequence {
	
	    public static void main(String[] args) {

	        //Input array
	        int[] arr = {130, 2, 300, 1, 5, 0};

	        //Finding longest consecutive sequence length
	        int result = LongestConsecutiveSequence.findLongestConsecutive(arr);

	        //Displaying result
	        System.out.println("Length of the longest consecutive sequence is: " + result);
	    }
	}

