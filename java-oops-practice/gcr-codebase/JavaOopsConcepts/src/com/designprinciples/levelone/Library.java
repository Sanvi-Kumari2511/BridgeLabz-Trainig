package com.designprinciples.levelone;
import java.util.ArrayList;

public class Library {
  
	    private String libraryName;
	    private ArrayList<Book> books;

	    //Constructor
	    public Library(String libraryName) {
	        this.libraryName = libraryName;
	        books = new ArrayList<>();
	    }

	    //Adding book to library
	    public void addBook(Book book) {
	        books.add(book);
	    }

	    //Displaying all the books in the library
	    public void showBooks() {
	        System.out.println("Books in " + libraryName + ":");
	        for (Book book : books) {
	            book.displayBook();
	        }
	    }
	
}
