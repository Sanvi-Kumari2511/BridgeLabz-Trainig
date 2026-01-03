package com.stackandqueue;

public class MainQueueUsingStack {
	
	    public static void main(String[] args) {

	        QueueUsingStack queue = new QueueUsingStack();

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);

	        System.out.println("Dequeued: " + queue.dequeue());
	        
	    }
	}


