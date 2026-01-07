package com.bookbazar;

    class EBook extends Book{
	
    	    //Constructor for EBook
    	    public EBook(String title, String author, double price, int stock) {
    	        super(title, author, price, stock);
    	    }

    	    //Higher discount for EBooks(Override)
    	    public double applyDiscount(int quantity) {
    	        return price * quantity * 0.20; 
    	    }
    	}
