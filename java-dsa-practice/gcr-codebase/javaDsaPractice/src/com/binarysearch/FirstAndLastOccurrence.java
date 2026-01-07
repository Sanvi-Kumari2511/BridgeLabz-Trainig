package com.binarysearch;

public class FirstAndLastOccurrence {

	    //Method to find first occurrence
	    public static int findFirst(int[] arr, int target) {
	        int left = 0, right = arr.length - 1;
	        int first = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                first = mid;        
	                right = mid - 1;    
	            } 
	            else if (arr[mid] < target) {
	                left = mid + 1;
	            } 
	            else {
	                right = mid - 1;
	            }
	        }
	        return first;
	    }

	    //Method to find last occurrence
	    public static int findLast(int[] arr, int target) {
	        int left = 0, right = arr.length - 1;
	        int last = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                last = mid;        
	                left = mid + 1;   
	            } 
	            else if (arr[mid] < target) {
	                left = mid + 1;
	            } 
	            else {
	                right = mid - 1;
	            }
	        }
	        return last;
	    }

	    public static void main(String[] args) {

	        int[] arr = {1, 3, 4, 2, 2, 2, 5};
	        int target = 2;

	        int first = findFirst(arr, target);
	        int last = findLast(arr, target);

	        if (first == -1) {
	            System.out.println("Element not found");
	        } 
	        else {
	            System.out.println("First Occurrence: " + first);
	            System.out.println("Last Occurrence: " + last);
	        }
	    }
	}

