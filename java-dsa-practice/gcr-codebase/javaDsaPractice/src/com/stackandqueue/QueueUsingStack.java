package com.stackandqueue;
import java.util.Stack;

public class QueueUsingStack {
	
	    private Stack<Integer> s1;
	    private Stack<Integer> s2;

	    //Constructor
	    public QueueUsingStack() {
	        s1 = new Stack<>();
	        s2 = new Stack<>();
	    }

	    //Enqueue operation
	    public void enqueue(int element) {
	        s1.push(element);
	        System.out.println(element + " inserted into queue");
	    }

	    //Dequeue operation
	    public int dequeue() {
	        if (s1.isEmpty() && s2.isEmpty()) {
	            System.out.println("Queue is empty");
	            return -1;
	        }

	        //Move elements only if s2 is empty
	        if (s2.isEmpty()) {
	            while (!s1.isEmpty()) {
	                s2.push(s1.pop());
	            }
	        }

	        return s2.pop();
	    }
	}

