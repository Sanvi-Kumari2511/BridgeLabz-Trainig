package com.constructor.levelone;

public class Books {
	private String title;
	private String author;
	private double price;
	private boolean availability;
	
	//Parameterized constructor
	Books(String title, String author, double price, boolean availability){
	    this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	} 
	
	void borrowBook(){
	    if(availability){
		   availability = false;
		   System.out.println("Book is available");
		}
		else{
		   System.out.println("Book is unavailable");
		}
	}
	
	void show(){
	    System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
		System.out.println("Availability: " + availability);
	}
}
