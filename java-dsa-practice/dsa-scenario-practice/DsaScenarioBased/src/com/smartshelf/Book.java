package com.smartshelf;

public class Book {
   int id;
   String title;
   
   //Constructor to initialize book details
   Book(int id, String title){
	   this.id = id;
	   this.title = title;
   }
   
   //Method to display the book's detail
   void display() {
	   System.out.println("ID: " + id + " Title: " + title);
   }
}
