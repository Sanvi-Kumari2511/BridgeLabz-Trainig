package com.stackandqueue;
import java.util.Stack;

public class StackUsingRecursion {
	
	    //Method to sort the stack
	    public static void sort(Stack<Integer> stack) {
	        if (!stack.isEmpty()) {
	            int top = stack.pop();
	            sort(stack);
	            insertInSortedOrder(stack, top);
	        }
	    }

	    //Insert element in sorted position
	    private static void insertInSortedOrder(Stack<Integer> stack, int value) {
	        if (stack.isEmpty() || stack.peek() <= value) {
	            stack.push(value);
	            return;
	        }

	        int temp = stack.pop();
	        insertInSortedOrder(stack, value);
	        stack.push(temp);
	    }
	}
