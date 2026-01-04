package com.hashmapsandhashfunctions;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	    //Method to find longest consecutive sequence length
	    public static int findLongestConsecutive(int[] arr) {

	        //Storing elements in HashSet for fast lookup
	        Set<Integer> set = new HashSet<>();

	        for (int number : arr) {
	            set.add(number);
	        }

	        int longest = 0;

	        //Traversing array
	        for (int number : arr) {

	            //Check if this is the start of a sequence
	            if (!set.contains(number - 1)) {

	                int currentNum = number;
	                int count = 1;

	                //Counting consecutive numbers
	                while (set.contains(currentNum + 1)) {
	                    currentNum++;
	                    count++;
	                }

	                //Updating longest sequence length
	                longest = Math.max(longest, count);
	            }
	        }

	        return longest;
	    }
	}

