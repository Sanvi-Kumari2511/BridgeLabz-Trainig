package com.encapsulation;

class Book extends LibraryItem implements Reservable {
	public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    //Override
    public int getLoanDuration() {
        return 14; 
    }

    //Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("Book reserved by " + borrowerName);
        } 
        else {
            System.out.println("Book is already reserved");
        }
    }

    //Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
