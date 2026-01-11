package com.libraryorganizer;

public class MainBookShelf {
	
	    public static void main(String[] args) {

	        //Creating BookShelf object
	        BookShelf shelf = new BookShelf();

	        //Creating Book objects
	        Book b1 = new Book("Harry Potter", "Fiction");
	        Book b2 = new Book("The Hobbit", "Fiction");
	        Book b3 = new Book("A Brief History of Time", "Science");

	        //Adding books to shelf
	        shelf.addBook(b1);
	        shelf.addBook(b2);
	        shelf.addBook(b3);

	        //Attempt to add duplicate
	        shelf.addBook(b1);

	        //Displaying library
	        shelf.displayLibrary();

	        //Borrow a book
	        shelf.removeBook("Fiction", "The Hobbit");

	        //Displaying updated library
	        shelf.displayLibrary();
	    }
}



