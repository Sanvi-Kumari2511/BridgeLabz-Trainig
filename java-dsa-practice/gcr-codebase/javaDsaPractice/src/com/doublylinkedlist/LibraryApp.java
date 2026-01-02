package com.doublylinkedlist;

public class LibraryApp {

	    public static void main(String[] args) {

	        BookList library = new BookList();

	        library.addAtBeginning(1, "Java Basics", "James Gosling", "Programming", true);
	        library.addAtEnd(2, "Data Structures", "Mark Weiss", "Education", true);
	        library.addAtEnd(3, "Clean Code", "Robert Martin", "Software", false);

	        library.displayForward();
	        library.displayReverse();

	        library.searchByTitle("Clean Code");
	        library.searchByAuthor("Mark Weiss");

	        library.updateAvailability(3, true);

	        library.countBooks();

	        library.removeById(2);
	        library.displayForward();
	    }
	}


 
