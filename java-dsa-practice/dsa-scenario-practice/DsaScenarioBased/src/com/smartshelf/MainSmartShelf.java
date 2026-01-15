package com.smartshelf;
import java.util.*;

public class MainSmartShelf {
   public static void main(String args []) {
	   
       //Taking inputs from user
	   Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter number of books: ");
	    
	    int n = sc.nextInt();
	    sc.nextLine();
	    
	    //Creating an array to store books
	    Book[] books = new Book [n];
	    
	    
	    //Taking book details from user
	    for(int i = 0; i < n; i++) {
	    	System.out.println("\nEnter book's details: " + (i + 1));
	    
	    System.out.println("Book ID: ");
	    int id = sc.nextInt();
	    
	    sc.nextLine();
	    
	    System.out.println(" Book Title: ");
	    String title = sc.nextLine();
	    
	    
	    //Creating a book object
	    books[i] = new Book(id, title);
   }
	    
	    
	            //Displaying books before sorting
		        System.out.println("Before Sorting: ");
		        for (Book b : books) {
		            b.display();
		        }

		        //Sort books using insertion sort
		        SmartShelf.insertionSort(books);

		        //Displaying books after sorting
		        System.out.println("\nAfter Sorting Alphabetically: ");
		        for (Book b : books) {
		            b.display();
		        }
       }
}

   
