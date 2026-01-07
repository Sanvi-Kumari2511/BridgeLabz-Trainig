package com.binarysearch;

public class RotationPoint {

	    // Method to find rotation point when duplicates exist
	    public static int findRotationPoint(int[] arr) {

	        int left = 0;
	        int right = arr.length - 1;

	        while (left < right) {

	            int mid = (left + right) / 2;

	            // Case 1: mid element greater than right element
	            if (arr[mid] > arr[right]) {
	                left = mid + 1;
	            }
	            // Case 2: mid element smaller than right element
	            else if (arr[mid] < arr[right]) {
	                right = mid;
	            }
	            // Case 3: arr[mid] == arr[right] (duplicate values)
	            else {
	                // Reduce search space safely
	                right--;
	            }
	        }

	        // left is the index of smallest element
	        return left;
	    }

	    public static void main(String[] args) {

	        int[] arr = {7,8,1,2,3,4};

	        int index = findRotationPoint(arr);

	        System.out.println("Rotation point index: " + index);
	        System.out.println("Smallest element: " + arr[index]);
	    }
	}
