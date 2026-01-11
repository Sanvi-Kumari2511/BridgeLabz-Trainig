package com.libraryorganizer;

//Book class represents a single book entity
public class Book {
	
	    private String title;
	    private String genre;

	    //Constructor to initialize book details
	    public Book(String title, String genre) {
	        this.title = title;
	        this.genre = genre;
	    }

	    //Getter for book title
	    public String getTitle() {
	        return title;
	    }

	    //Getter for genre
	    public String getGenre() {
	        return genre;
	    }

	    //Overriding toString() for clean printing
	    public String toString() {
	        return title;
	    }
}


