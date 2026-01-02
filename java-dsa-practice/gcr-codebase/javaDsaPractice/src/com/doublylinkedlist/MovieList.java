package com.doublylinkedlist;

public class MovieList {

	    private Movie head;
	    private Movie tail;

	    //Adding movie at the beginning
	    public void addAtBeginning(String title, String director, int year, double rating) {
	        Movie node = new Movie(title, director, year, rating);

	        if (head == null) {
	            head = tail = node;
	        } 
	        else {
	            node.next = head;
	            head.prev = node;
	            head = node;
	        }
	        System.out.println("Movie added at the beginning");
	    }

	    //Adding movie at the end
	    public void addAtEnd(String title, String director, int year, double rating) {
	        Movie node = new Movie(title, director, year, rating);

	        if (head == null) {
	            head = tail = node;
	        } 
	        
	        else {
	        	
	            tail.next = node;
	            node.prev = tail;
	            tail = node;
	        }
	        
	        System.out.println("Movie added at the end");
	    }

	    //Adding movie at a specific position
	    public void addAtPosition(int position, String title, String director, int year, double rating) {

	        if (position == 1) {
	            addAtBeginning(title, director, year, rating);
	            return;
	        }

	        Movie node = new Movie(title, director, year, rating);
	        Movie temp = head;

	        for (int i = 1; i < position - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null || temp.next == null) {
	            addAtEnd(title, director, year, rating);
	            return;
	        }

	        node.next = temp.next;
	        node.prev = temp;
	        temp.next.prev = node;
	        temp.next = node;

	        System.out.println("Movie added at position " + position);
	    }

	    //Remove movie by title
	    public void removeByTitle(String title) {

	        Movie temp = head;

	        while (temp != null) {
	            if (temp.title.equalsIgnoreCase(title)) {

	                if (temp == head) {
	                    head = head.next;
	                    if (head != null)
	                        head.prev = null;
	                } 
	                else if (temp == tail) {
	                    
	                	tail = tail.prev;
	                	tail.next = null;
	                }
	                else {
	                    
	                	temp.prev.next = temp.next;
	                    temp.next.prev = temp.prev;
	                }

	                System.out.println("Movie is removed successfully");
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Movie is not found");
	    }

	    //Search movie by director
	    public void searchByDirector(String director) {

	        Movie temp = head;
	        boolean found = false;

	        while (temp != null) {
	            if (temp.director.equalsIgnoreCase(director)) {
	                displayMovie(temp);
	                found = true;
	            }
	            temp = temp.next;
	        }

	        if (!found) {
	            System.out.println("No movie found for given director");
	        }
	    }

	    //Search movie by rating
	    public void searchByRating(double rating) {

	        Movie temp = head;
	        boolean found = false;

	        while (temp != null) {
	            if (temp.rating == rating) {
	                displayMovie(temp);
	                found = true;
	            }
	            temp = temp.next;
	        }

	        if (!found) {
	            System.out.println("No movie found with given rating");
	        }
	    }

	    //Update movie rating by title
	    public void updateRating(String title, double newRating) {

	        Movie temp = head;

	        while (temp != null) {
	            if (temp.title.equalsIgnoreCase(title)) {
	                temp.rating = newRating;
	                System.out.println("Movie rating is updated");
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Movie is not found");
	    }

	    //Displaying movies forward
	    public void displayForward() {

	        if (head == null) {
	            System.out.println("No movies are available");
	            return;
	        }

	        Movie temp = head;
	        System.out.println("\nMovies (Forward Order):");

	        while (temp != null) {
	            displayMovie(temp);
	            temp = temp.next;
	        }
	    }

	    //Displaying movies in reverse
	    public void displayReverse() {

	        if (tail == null) {
	            System.out.println("No movies are available");
	            return;
	        }

	        Movie temp = tail;
	        System.out.println("\nMovies (Reverse Order):");

	        while (temp != null) {
	            displayMovie(temp);
	            temp = temp.prev;
	        }
	    }

	    //Helper method to display single movie
	    private void displayMovie(Movie m) {
	        System.out.println("Title: " + m.title + ", Director: " + m.director + ", Year: " + m.year + ", Rating: " + m.rating);
	    }
	}

