package com.javacollections.queueinterface;

public class CircularBuffer {
	
	    private int[] buffer;
	    private int size;
	    
	    //Points to the oldest element
	    private int start = 0; 
	    
	    //Points to the next insertion index
	    private int end = 0;   
	    
	    //Current number of elements
	    private int count = 0; 

	    //Constructor
	    public CircularBuffer(int size) {
	        this.size = size;
	        buffer = new int[size];
	    }

	    //Inserting an element
	    public void insert(int value) {
	        buffer[end] = value;          
	        end = (end + 1) % size;       
	        if (count == size) {          
	            start = (start + 1) % size;
	        } 
	        
	        else {
	            count++;
	        }
	    }

	    //Getting current elements in buffer as string
	    public String getBuffer() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("[");
	        for (int i = 0; i < count; i++) {
	            int index = (start + i) % size;
	            sb.append(buffer[index]);
	            if (i < count - 1) sb.append(", ");
	        }
	        sb.append("]");
	        return sb.toString();
	    }

	    
	    public static void main(String[] args) {
	        CircularBuffer cb = new CircularBuffer(3);

	        cb.insert(1);
	        cb.insert(2);
	        cb.insert(3);
	        System.out.println(cb.getBuffer()); 

	        cb.insert(4);
	        System.out.println(cb.getBuffer()); 

	        cb.insert(5);
	        System.out.println(cb.getBuffer()); 
	  }
}
