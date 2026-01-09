package com.algorithmruntimeanalysis;
import java.util.Arrays;

public class SearchTarget {
	
	    //Linear Search
	    public static int linearSearch(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    //Binary Search
	    public static int binarySearch(int[] arr, int target) {
	        int low = 0, high = arr.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;

	            if (arr[mid] == target)
	                return mid;
	            else if (arr[mid] < target)
	                low = mid + 1;
	            else
	                high = mid - 1;
	        }
	        return -1;
	    }

	    public static void main(String[] args) {

	        int N = 1000000;
	        int[] data = new int[N];

	        //Fill array
	        for (int i = 0; i < N; i++) {
	            data[i] = i;
	        }

	        int target = N - 1;

	        //Linear Search timing
	        long start = System.nanoTime();
	        linearSearch(data, target);
	        long end = System.nanoTime();
	        System.out.println("Linear Search Time: " + (end - start) / 1000000.0 + " ms");

	        //Sort array for Binary Search
	        Arrays.sort(data);

	        //Binary Search timing
	        start = System.nanoTime();
	        binarySearch(data, target);
	        end = System.nanoTime();
	        System.out.println("Binary Search Time: " + (end - start) / 1000000.0 + " ms");
	    }
	}

