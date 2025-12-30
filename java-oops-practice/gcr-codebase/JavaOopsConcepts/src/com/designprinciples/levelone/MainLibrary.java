package com.designprinciples.levelone;

public class MainLibrary {

	    public static void main(String[] args) {

	        //Creating Book objects 
	        Book book1 = new Book("Java Programming", "James Gosling");
	        Book book2 = new Book("Clean Code", "Robert C. Martin");

	        //Creating Library objects
	        Library centralLibrary = new Library("Central Library");
	        Library cityLibrary = new Library("City Library");

	        //Adding books to libraries
	        centralLibrary.addBook(book1);
	        centralLibrary.addBook(book2);

	        cityLibrary.addBook(book2); // Same book in another library

	        //Displaying books
	        centralLibrary.showBooks();
	        System.out.println();
	        cityLibrary.showBooks();
	    
	}

}
