package com.bookshelf;
import java.util.*;

public class Library {
	
	    //Genre -> List of Books
	    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

	    //To prevent duplicate books
	    private HashSet<String> bookSet = new HashSet<>();

	    //Adding a book to library
	    public void addBook(String genre, String title, String author) {
	        Book book = new Book(title, author);

	        //Checking for duplication
	        if (bookSet.contains(book.getKey())) {
	            System.out.println("Book already exists");
	            return;
	        }

	        catalog.putIfAbsent(genre, new LinkedList<>());
	        catalog.get(genre).add(book);
	        bookSet.add(book.getKey());

	        System.out.println("Book added");
	    }

	    //Removing a book
	    public void removeBook(String genre, String title, String author) {
	        if (!catalog.containsKey(genre)) {
	            System.out.println("Genre not found");
	            return;
	        }

	        LinkedList<Book> books = catalog.get(genre);
	        Iterator<Book> iterator = books.iterator();

	        while (iterator.hasNext()) {
	            Book book = iterator.next();
	            if (book.title.equals(title) && book.author.equals(author)) {
	                iterator.remove();
	                bookSet.remove(book.getKey());
	                System.out.println("Book removed");
	                return;
	            }
	        }

	        System.out.println("Book not found");
	    }

	    //Displaying library genre-wise
	    public void displayLibrary() {
	        if (catalog.isEmpty()) {
	            System.out.println("Library is empty");
	            return;
	        }

	        for (String genre : catalog.keySet()) {
	            System.out.println("\nGenre: " + genre);
	            for (Book book : catalog.get(genre)) {
	                System.out.println("  - " + book);
	            }
	       }
	  }
}


	