package com.stackandqueue;
import java.util.Stack;

public class StockSpanProblem {

	    //Method to calculate stock span
	    public static int[] calculateSpan(int[] prices) {

	        int[] span = new int[prices.length];

	        //Stack to store indices of days
	        Stack<Integer> stack = new Stack<>();

	        //First day span is always 1
	        span[0] = 1;
	        stack.push(0);

	        //Loop through remaining days
	        for (int i = 1; i < prices.length; i++) {

	            //Pop elements while current price is greater or equal
	            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
	                stack.pop();
	            }

	            //If stack becomes empty, price is greater than all previous prices
	            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

	            //Push current day index
	            stack.push(i);
	        }

	        return span;
	    }
	}


