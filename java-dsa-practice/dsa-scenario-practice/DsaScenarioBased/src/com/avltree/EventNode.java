package com.avltree;

public class EventNode {
	
	int time;            
    String eventName;    
    EventNode left, right;

    //Constructor to initialize event details
    EventNode(int time, String eventName) {
        this.time = time;
        this.eventName = eventName;
        left = right = null;
    }
} 
