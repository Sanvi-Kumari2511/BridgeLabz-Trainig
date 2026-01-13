package com.bookshelf;

public class BookShelf {
	
	    public static void main(String[] args) {

	        Library library = new Library();

	        library.addBook("Fiction", "The Alchemist", "Paulo Coelho");
	        library.addBook("Fiction", "1984", "George Orwell");
	        library.addBook("Science", "A Brief History of Time", "Stephen Hawking");

	        library.displayLibrary();

	        library.removeBook("Fiction", "1984", "George Orwell");

	        library.displayLibrary();
	    }
}


