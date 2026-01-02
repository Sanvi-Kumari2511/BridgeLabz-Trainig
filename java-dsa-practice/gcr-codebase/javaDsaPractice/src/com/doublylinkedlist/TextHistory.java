package com.doublylinkedlist;

public class TextHistory {
	
	    private TextState head;
	    private TextState tail;
	    private TextState current;

	    private int size;
	    private final int MAX_SIZE = 10;

	    //Adding new text state
	    public void addState(String content) {

	        TextState node = new TextState(content);

	        //If undo was used, clear redo history
	        if (current != null && current.next != null) {
	            current.next.prev = null;
	            current.next = null;
	            tail = current;
	        }

	        if (head == null) {
	            head = tail = current = node;
	            size = 1;
	            return;
	        }

	        tail.next = node;
	        node.prev = tail;
	        tail = node;
	        current = node;
	        size++;

	        //Maintaining history size limit
	        if (size > MAX_SIZE) {
	            head = head.next;
	            head.prev = null;
	            size--;
	        }
	    }

	    //Undo operation
	    public void undo() {

	        if (current == null || current.prev == null) {
	            System.out.println("Nothing to undo.");
	            return;
	        }

	        current = current.prev;
	        System.out.println("Undo performed.");
	    }

	    //Redo operation
	    public void redo() {

	        if (current == null || current.next == null) {
	            System.out.println("Nothing to redo.");
	            return;
	        }

	        current = current.next;
	        System.out.println("Redo performed.");
	    }

	    //Displaying current text
	    public void displayCurrentState() {

	        if (current == null) {
	            System.out.println("Editor is empty.");
	            return;
	        }

	        System.out.println("Current Text: " + current.content);
	    }
	}
