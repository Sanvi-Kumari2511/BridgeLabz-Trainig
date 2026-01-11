package com.tabhistorymanager;

//BrowserTab maintains browsing history using Doubly Linked List
public class BrowserBuddy {

	    private HistoryNode current;  

	    //Open a new page
	    public void visit(String url) {

	        HistoryNode newNode = new HistoryNode(url);

	        //If this is the first page
	        if (current == null) {
	            current = newNode;
	        } 
	        else {
	            //Removing forward history
	            current.next = null;

	            //Linking new page
	            newNode.prev = current;
	            current.next = newNode;
	            current = newNode;
	        }

	        System.out.println("Visited: " + url);
	    }

	    //Navigate backward
	    public void back() {
	        if (current != null && current.prev != null) {
	            current = current.prev;
	            System.out.println("Back to: " + current.url);
	        }
	        else {
	            System.out.println("No previous page.");
	        }
	    }

	    //Navigating forward
	    public void forward() {
	        if (current != null && current.next != null) {
	            current = current.next;
	            System.out.println("Forward to: " + current.url);
	        }
	        else {
	            System.out.println("No forward page.");
	        }
	    }

	    //Getting current page
	    public String getCurrentPage() {
	        return current != null ? current.url : "No page open";
	    }
}

