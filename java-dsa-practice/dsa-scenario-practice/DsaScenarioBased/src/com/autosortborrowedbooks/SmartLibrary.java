package com.autosortborrowedbooks;
import java.util.*;

public class SmartLibrary {
	
	//Method to sort books alphabetically using Insertion Sort
    public static void insertionSort(Book[] books) {

        //Start from second element
        for (int i = 1; i < books.length; i++) {

            //Store current book
            Book key = books[i];
            int j = i - 1;

            //Shift books that come after key alphabetically
            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            //Insert book at correct position
            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books borrowed: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        //Array to store books
        Book[] books = new Book[n];

        //Taking book titles from user
        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter book title " + (i + 1) + ": ");
            String title = sc.nextLine();

            //Creating Book object
            books[i] = new Book(title);
        }

        //Applying Insertion Sort
        insertionSort(books);

        //Displaying sorted book list
        System.out.println("\nBorrowed Books:");
        for (Book b : books) {
            System.out.println(b.title);
        }
    }
}
