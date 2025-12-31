package com.inheritance.leveltwo;

public class Book {
   String title;
   int publicationYear;
   
   //Constructor of Book class
   Book(String title, int publicationYear){
	   this.title = title;
	   this.publicationYear = publicationYear;
   }
   
   //Creating a method to be overridden
   void displayInfo() {
	   System.out.println("Displaying the details of Book:");
	   System.out.println("Title of the book: " + title);
	   System.out.println("Publication year of the book: "+ publicationYear);
	   
   }
}
