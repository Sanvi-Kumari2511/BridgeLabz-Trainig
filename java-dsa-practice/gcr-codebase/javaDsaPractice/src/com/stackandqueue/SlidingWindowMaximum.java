package com.stackandqueue;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

	    //Method to find maximum in each sliding window
	    public static int[] maxSlidingWindow(int[] arr, int k) {

	        //Result array to store maximum
	        int[] result = new int[arr.length - k + 1];

	        //Deque to store indices of array elements
	        Deque<Integer> deque = new LinkedList<>();

	        for (int i = 0; i < k; i++) {

	            //Removing smaller elements from the back
	            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
	                deque.removeLast();
	            }

	            //Adding current element index
	            deque.addLast(i);
	        }

	        for (int i = k; i < arr.length; i++) {

	            //Front of deque is the maximum of the previous window
	            result[i - k] = arr[deque.peekFirst()];

	            //Removing indices which are out of this window
	            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
	                deque.removeFirst();
	            }

	            //Removing smaller elements from the back
	            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
	                deque.removeLast();
	            }

	            
	            deque.addLast(i);
	        }

	        //Last window's maximum
	        result[arr.length - k] = arr[deque.peekFirst()];

	        return result;
	    }
	}
