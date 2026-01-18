package com.javacollections.listinterface;

import com.javacollections.queueinterface.StackUsingQueue;

public class MainStackUsingQueue {

	public static void main(String[] args) {

		StackUsingQueue stack = new StackUsingQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());    // 3
        System.out.println("Popped element: " + stack.pop()); // 3
        System.out.println("Top after pop: " + stack.top());  // 2
    }
}
