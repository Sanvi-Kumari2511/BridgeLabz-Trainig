package com.encapsulation;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

	    public static void main(String[] args) {

	        List<LibraryItem> items = new ArrayList<>();

	        LibraryItem item1 = new Book(1, "Java Programming", "James Gosling");
	        LibraryItem item2 = new Magazine(2, "Tech Today", "Editorial Team");
	        LibraryItem item3 = new DVD(3, "Inception", "Christopher Nolan");

	        items.add(item1);
	        items.add(item2);
	        items.add(item3);

	        for (LibraryItem item : items) {

	            item.getItemDetails();

	            if (item instanceof Reservable) {
	                Reservable reservable = (Reservable) item;

	                if (reservable.checkAvailability()) {
	                    reservable.reserveItem("Sanvi");
	                }
	            }

	            System.out.println("----------------------------");
	        }
	    }
	}

