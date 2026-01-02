package com.doublylinkedlist;

public class BookList {
	
	    private Book head;
	    private Book tail;

	    //Adding book at the beginning
	    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {

	        Book node = new Book(id, title, author, genre, available);

	        if (head == null) {
	            head = tail = node;
	        } 
	        else {
	            node.next = head;
	            head.prev = node;
	            head = node;
	        }
	        System.out.println("Book added at beginning.");
	    }

	    //Adding book at the end
	    public void addAtEnd(int id, String title, String author, String genre, boolean available) {

	        Book node = new Book(id, title, author, genre, available);

	        if (head == null) {
	            head = tail = node;
	        } 
	        else {
	            tail.next = node;
	            node.prev = tail;
	            tail = node;
	        }
	        System.out.println("Book added at end.");
	    }

	    //Adding book at a specific position
	    public void addAtPosition(int position, int id, String title, String author, String genre, boolean available) {

	        if (position == 1) {
	            addAtBeginning(id, title, author, genre, available);
	            return;
	        }

	        Book node = new Book(id, title, author, genre, available);
	        Book temp = head;

	        for (int i = 1; i < position - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null || temp == tail) {
	            addAtEnd(id, title, author, genre, available);
	            return;
	        }

	        node.next = temp.next;
	        node.prev = temp;
	        temp.next.prev = node;
	        temp.next = node;

	        System.out.println("Book added at position " + position);
	    }

	    //Removing book by Book ID
	    public void removeById(int id) {

	        if (head == null) {
	            System.out.println("Library is empty.");
	            return;
	        }

	        Book temp = head;

	        while (temp != null) {
	            if (temp.bookId == id) {

	                if (temp == head) {
	                    head = head.next;
	                    if (head != null)
	                        head.prev = null;
	                } 
	                else if (temp == tail) {
	                    tail = tail.prev;
	                    if (tail != null)
	                        tail.next = null;
	                } 
	                else {
	                    temp.prev.next = temp.next;
	                    temp.next.prev = temp.prev;
	                }

	                System.out.println("Book removed successfully");
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Book not found.");
	    }

	    //Searching book by Title
	    public void searchByTitle(String title) {

	        Book temp = head;
	        boolean found = false;

	        while (temp != null) {
	            if (temp.title.equalsIgnoreCase(title)) {
	                displayBook(temp);
	                found = true;
	            }
	            temp = temp.next;
	        }

	        if (!found) {
	            System.out.println("Book not found.");
	        }
	    }

	    //Searching book by Author
	    public void searchByAuthor(String author) {

	        Book temp = head;
	        boolean found = false;

	        while (temp != null) {
	            if (temp.author.equalsIgnoreCase(author)) {
	                displayBook(temp);
	                found = true;
	            }
	            temp = temp.next;
	        }

	        if (!found) {
	            System.out.println("No books found by this author");
	        }
	    }

	    //Updating Availability Status
	    public void updateAvailability(int id, boolean status) {

	        Book temp = head;

	        while (temp != null) {
	            if (temp.bookId == id) {
	                temp.isAvailable = status;
	                System.out.println("Availability status updated");
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Book not found.");
	    }

	    //Displaying books forward
	    public void displayForward() {

	        if (head == null) {
	            System.out.println("No books available");
	            return;
	        }

	        Book temp = head;
	        System.out.println("\nLibrary Books (Forward):");

	        while (temp != null) {
	            displayBook(temp);
	            temp = temp.next;
	        }
	    }

	    //Displaying books in reverse
	    public void displayReverse() {

	        if (tail == null) {
	            System.out.println("No books available");
	            return;
	        }

	        Book temp = tail;
	        System.out.println("\nLibrary Books (Reverse):");

	        while (temp != null) {
	            displayBook(temp);
	            temp = temp.prev;
	        }
	    }

	    //Counting total books
	    public void countBooks() {

	        int count = 0;
	        Book temp = head;

	        while (temp != null) {
	            count++;
	            temp = temp.next;
	        }

	        System.out.println("Total number of books: " + count);
	    }

	    //Helper method to display single book
	    private void displayBook(Book b) {
	        System.out.println("ID: " + b.bookId + ", Title: " + b.title + ", Author: " + b.author + ", Genre: " + b.genre + ", Available: " + (b.isAvailable ? "Yes" : "No"));
	    }
	}

