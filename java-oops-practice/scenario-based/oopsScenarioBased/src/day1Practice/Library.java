package day1Practice;
import java.util.*;

public class Library {
	
	    Map<String, List<Book>> booksByAuthor = new HashMap<>();

	    public void addBook(String author, Book book) {
	        booksByAuthor.computeIfAbsent(author, k -> new ArrayList<>()).add(book);
	    }

	    public void showBooks() {
	        for (String author : booksByAuthor.keySet()) {
	            System.out.println("Author: " + author);
	            for (Book book : booksByAuthor.get(author)) {
	                System.out.println(" - " + book.title);
	            }
	        }
	    }
	}

