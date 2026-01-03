package com.stackandqueue;
import java.util.Stack;

public class MainStackUsingRecursion {

	    public static void main(String[] args) {

	        Stack<Integer> stack = new Stack<>();
            
	        //Push elements into the stack
	        stack.push(40);
	        stack.push(10);
	        stack.push(20);
	        stack.push(5);
            
	        //Displaying original stack
	        System.out.println("Original Stack: " + stack);
            
	        //Calling sort method from StackUsingRecursion class
	        StackUsingRecursion.sort(stack);
            
	        //Displaying sorted stack
	        System.out.println("Sorted Stack: " + stack);
	    }
	}
