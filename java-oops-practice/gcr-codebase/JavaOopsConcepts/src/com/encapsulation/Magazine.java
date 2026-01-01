package com.encapsulation;

class Magazine extends LibraryItem implements Reservable {
	public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    //Override
    public int getLoanDuration() {
        return 7; 
    }

    //Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("Magazine reserved by " + borrowerName);
        } 
        else {
            System.out.println("Magazine is not available");
        }
    }

    //Override
    public boolean checkAvailability() {
        return isAvailable();
    }

}
