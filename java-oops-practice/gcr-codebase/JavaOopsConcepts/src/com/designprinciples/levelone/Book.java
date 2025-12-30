package com.designprinciples.levelone;

public class Book {
	    private String title;
	    private String author;

	    //Constructor
	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    //Creating a method to display book details
	    public void displayBook() {
	        System.out.println("Title: " + title + ", Author: " + author);
	    }
	

}
