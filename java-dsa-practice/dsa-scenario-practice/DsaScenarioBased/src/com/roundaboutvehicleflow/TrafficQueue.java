package com.roundaboutvehicleflow;
import java.util.LinkedList;
import java.util.Queue;

public class TrafficQueue {
	
	    private Queue<String> queue;
	    private int capacity;

	    //Constructor
	    public TrafficQueue(int capacity) {
	        this.capacity = capacity;
	        queue = new LinkedList<>();
	    }

	    //Adding vehicle to waiting queue
	    public void enqueue(String vehicle) {
	        if (queue.size() == capacity) {
	            System.out.println("Queue overflow. Cannot add " + vehicle);
	        } 
	        
	        else {
	            queue.offer(vehicle);
	            System.out.println("Vehicle added to waiting queue: " + vehicle);
	        }
	    }

	    //Removing vehicle from queue
	    public String dequeue() {
	        if (queue.isEmpty()) {
	        	
	            System.out.println("Queue underflow");
	            return null;
	        }
	        return queue.poll();
	    }

	    //Checking if queue is empty
	    public boolean isEmpty() {
	        return queue.isEmpty();
	    }
}

