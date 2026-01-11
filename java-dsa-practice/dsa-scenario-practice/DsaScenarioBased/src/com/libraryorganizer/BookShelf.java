package com.libraryorganizer;
import java.util.*;

//BookShelf manages genre-wise books using HashMap and LinkedList
public class BookShelf {

	    //HashMap to store genre (list of books)
	    private HashMap<String, LinkedList<Book>> genreCatalog;

	    //HashSet to avoid duplicate books
	    private HashSet<String> bookSet;

	    //Constructor to initialize collections
	    public BookShelf() {
	        genreCatalog = new HashMap<>();
	        bookSet = new HashSet<>();
	    }

	    //Method to add a book
	    public void addBook(Book book) {

	        //Checking for duplicate book
	        if (bookSet.contains(book.getTitle())) {
	            System.out.println("Book already exists: " + book.getTitle());
	            return;
	        }

	        //Creating genre list if not present
	        genreCatalog.putIfAbsent(book.getGenre(), new LinkedList<>());

	        //Adding book to genre list
	        genreCatalog.get(book.getGenre()).add(book);

	        //Adding to HashSet to prevent duplication
	        bookSet.add(book.getTitle());

	        System.out.println("Book added: " + book.getTitle());
	    }

	    //Method to remove a book
	    public void removeBook(String genre, String title) {

	        //Checking if genre exists
	        if (!genreCatalog.containsKey(genre)) {
	            System.out.println("Genre not found");
	            return;
	        }

	        LinkedList<Book> books = genreCatalog.get(genre);
	        Iterator<Book> iterator = books.iterator();

	        //Iterating to find the book
	        while (iterator.hasNext()) {
	            Book book = iterator.next();
	            
	            if (book.getTitle().equals(title)) {
	                iterator.remove();     
	                bookSet.remove(title); 
	                System.out.println("Book borrowed: " + title);
	                return;
	            }
	        }

	        System.out.println("Book not available");
	    }

	    //Displaying all books genre-wise
	    public void displayLibrary() {
	        System.out.println("\nLibrary Catalog");
	        
	        for (String genre : genreCatalog.keySet()) {
	            System.out.println(genre + " → " + genreCatalog.get(genre));
	        }
	  }
}

