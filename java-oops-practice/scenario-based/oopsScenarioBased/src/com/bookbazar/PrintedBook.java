package com.bookbazar;

public class PrintedBook extends Book {
	
	    //Constructor for PrintedBook
	    public PrintedBook(String title, String author, double price, int stock) {
	        super(title, author, price, stock);
	    }

	    //Lower discount for Printed Books(Override)
	    public double applyDiscount(int quantity) {
	        return price * quantity * 0.10; 
	    }
	}

