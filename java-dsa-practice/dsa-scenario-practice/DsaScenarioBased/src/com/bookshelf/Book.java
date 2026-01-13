package com.bookshelf;

public class Book {
	
	    String title;
	    String author;

	    //Constructor to initialize book details
	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    //Unique key to avoid duplication
	    public String getKey() {
	        return title + "_" + author;
	    }

	    //Override
	    public String toString() {
	        return title + " by " + author;
	    }
}


