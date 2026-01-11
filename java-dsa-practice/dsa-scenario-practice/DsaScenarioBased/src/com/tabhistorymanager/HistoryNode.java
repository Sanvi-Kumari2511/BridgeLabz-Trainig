package com.tabhistorymanager;

//Node class for Doubly Linked List
public class HistoryNode {
	
	    String url;
	    HistoryNode prev;
	    HistoryNode next;

	    //Constructor
	    public HistoryNode(String url) {
	        this.url = url;
	        this.prev = null;
	        this.next = null;
	    }
	}

