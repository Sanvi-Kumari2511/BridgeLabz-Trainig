package com.javacollections.queueinterface;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
	
	//Reverse queue using only queue operations
    static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }

        int front = queue.remove();   
        reverseQueue(queue);        
        queue.add(front);            
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverseQueue(queue);

        System.out.println(queue); 
    }
}
