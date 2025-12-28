package com.constructor.levelone;

public class Book {
	String title;
	String author;
	double price;
	
	//Default constructor
	Book(){
		
	}
	
	//Parameterized constructor
	Book(String title, String author, double price){
	  this.title = title;
	  this.author = author;
	  this.price = price;
	}
	
    void show(){
       System.out.println("Title: " + title);
       System.out.println("Author: " + author);   
	   System.out.println("Price: " + price);
	}
}

