package com.encapsulation;

abstract class LibraryItem {

	    //Encapsulated fields
	    private int itemId;
	    private String title;
	    private String author;
	    private String borrowerName;
	    private boolean isAvailable = true;

	    //Constructor
	    public LibraryItem(int itemId, String title, String author) {
	        this.itemId = itemId;
	        this.title = title;
	        this.author = author;
	    }

	    //Abstract method
	    public abstract int getLoanDuration();

	    //Concrete method
	    public void getItemDetails() {
	        System.out.println("Item ID is: " + itemId);
	        System.out.println("Title is: " + title);
	        System.out.println("Author name is: " + author);
	        System.out.println("Loan Duration is: " + getLoanDuration() + " days");
	        System.out.println("Available: " + isAvailable);
	    }

	    //Encapsulation 
	    protected void setBorrower(String borrowerName) {
	        this.borrowerName = borrowerName;
	        this.isAvailable = false;
	    }

	    protected void clearBorrower() {
	        this.borrowerName = null;
	        this.isAvailable = true;
	    }

	    protected boolean isAvailable() {
	        return isAvailable;
	    }
	}


