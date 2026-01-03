package com.stackandqueue;

public class MainSlidingWindowMaximum {
	
	    public static void main(String[] args) {

	        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};

	        int k = 3;

	        //Finding maximum sliding window
	        int[] maxValues = SlidingWindowMaximum.maxSlidingWindow(arr, k);

	        //Displaying input array
	        System.out.print("Elements in an array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        // Displaying result
	        System.out.print("\nMaximum of sliding window: ");
	        for (int i = 0; i < maxValues.length; i++) {
	            System.out.print(maxValues[i] + " ");
	        }
	    }
	}

