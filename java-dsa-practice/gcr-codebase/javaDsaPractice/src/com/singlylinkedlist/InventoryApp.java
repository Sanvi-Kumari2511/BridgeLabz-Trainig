package com.singlylinkedlist;

public class InventoryApp {

	    public static void main(String[] args) {

	        InventoryList list = new InventoryList();

	        list.addAtBeginning(101, "Pen", 50, 10);
	        list.addAtEnd(102, "Notebook", 30, 50);
	        list.addAtEnd(103, "Pencil", 100, 5);

	        list.displayAll();

	        list.updateQuantity(101, 60);
	        list.searchById(102);
	        list.searchByName("Pencil");

	        list.calculateTotalValue();

	        list.sortByName(true);
	        list.displayAll();

	        list.sortByPrice(false);
	        list.displayAll();

	        list.removeById(102);
	        list.displayAll();
	    }
	}

