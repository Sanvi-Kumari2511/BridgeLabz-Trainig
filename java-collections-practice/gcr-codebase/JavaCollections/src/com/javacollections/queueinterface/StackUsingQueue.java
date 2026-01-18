package com.javacollections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	    private Queue<Integer> q1 = new LinkedList<>();
	    private Queue<Integer> q2 = new LinkedList<>();

	    // Push element onto stack
	    public void push(int x) {
	        q1.add(x); // always add to q1
	    }

	    // Pop element from stack
	    public int pop() {
	        if (q1.isEmpty()) {
	            throw new RuntimeException("Stack is empty");
	        }

	        // Leave last element in q1 and move others to q2
	        while (q1.size() > 1) {
	            q2.add(q1.remove());
	        }

	        int top = q1.remove(); // last element

	        // Swap q1 and q2
	        Queue<Integer> temp = q1;
	        q1 = q2;
	        q2 = temp;

	        return top;
	    }

	    // Get the top element without removing
	    public int top() {
	        if (q1.isEmpty()) {
	            throw new RuntimeException("Stack is empty");
	        }

	        while (q1.size() > 1) {
	            q2.add(q1.remove());
	        }

	        int top = q1.remove();
	        q2.add(top); // put it back

	        // Swap q1 and q2
	        Queue<Integer> temp = q1;
	        q1 = q2;
	        q2 = temp;

	        return top;
	    }

	    // Check if stack is empty
	    public boolean isEmpty() {
	        return q1.isEmpty();
	    }
	}
