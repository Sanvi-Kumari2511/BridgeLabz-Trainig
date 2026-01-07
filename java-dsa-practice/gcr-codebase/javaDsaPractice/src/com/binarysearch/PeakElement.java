package com.binarysearch;

public class PeakElement {

	    //Method to find any one peak element
	    public static int findPeak(int[] arr) {

	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {

	            int mid = left + (right - left) / 2;

	            //Checking left boundary
	            boolean leftOK = (mid == 0) || (arr[mid] > arr[mid - 1]);

	            //Checking right boundary
	            boolean rightOK = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

	            //If both conditions satisfied, peak found
	            if (leftOK && rightOK) {
	                return mid;
	            }

	            //If left neighbor is greater, peak lies on left side
	            if (mid > 0 && arr[mid] < arr[mid - 1]) {
	                right = mid - 1;
	            }
	            //Else peak lies on right side
	            else {
	                left = mid + 1;
	            }
	        }

	        return -1; 
	    }

	    public static void main(String[] args) {

	        int[] arr = {2,1,3,5,6};

	        int peakIndex = findPeak(arr);

	        System.out.println("Peak element: " + arr[peakIndex]);
	        System.out.println("Found at index: " + peakIndex);
	    }
	}
