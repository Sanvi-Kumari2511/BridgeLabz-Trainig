package com.hashmapsandhashfunctions;

public class CustomHashMap {
	
	    //Node class for linked list
	    class Node {
	        String key;
	        int value;
	        Node next;

	        Node(String key, int value) {
	            this.key = key;
	            this.value = value;
	            this.next = null;
	        }
	    }

	    private int size;        
	    private Node[] table;    

	    //Constructor
	    public CustomHashMap(int size) {
	        this.size = size;
	        table = new Node[size];
	    }

	    //Hash function
	    private int getIndex(String key) {
	        return Math.abs(key.hashCode()) % size;
	    }

	    //Insert key-value pair
	    public void put(String key, int value) {
	        int index = getIndex(key);
	        Node head = table[index];

	        //If key already exists, update value
	        while (head != null) {
	            if (head.key.equals(key)) {
	                head.value = value;
	                return;
	            }
	            
	            head = head.next;
	        }

	        //Insert new node at beginning
	        Node newNode = new Node(key, value);
	        newNode.next = table[index];
	        table[index] = newNode;
	    }

	    //Get value by key
	    public Integer get(String key) {
	        int index = getIndex(key);
	        Node head = table[index];

	        while (head != null) {
	            if (head.key.equals(key)) {
	                return head.value;
	            }
	            
	            head = head.next;
	        }
	        
	        return null; 
	    }

	    //Remove key-value pair
	    public void remove(String key) {
	        int index = getIndex(key);
	        Node head = table[index];
	        Node prev = null;

	        while (head != null) {
	            if (head.key.equals(key)) {
	                if (prev == null) {
	                    table[index] = head.next;
	                } 
	                else {
	                    prev.next = head.next;
	                }
	                
	                return;
	            }
	            
	            prev = head;
	            head = head.next;
	        }
	    }
	}

