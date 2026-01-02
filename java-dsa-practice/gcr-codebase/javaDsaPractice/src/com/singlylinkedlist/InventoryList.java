package com.singlylinkedlist;

public class InventoryList {
	
	    private Item head;

	    //Adding item at the beginning
	    public void addAtBeginning(int id, String name, int qty, double price) {
	        Item node = new Item(id, name, qty, price);
	        node.next = head;
	        head = node;
	        System.out.println("Item added at beginning.");
	    }

	    //Adding item at the end
	    public void addAtEnd(int id, String name, int qty, double price) {
	        Item node = new Item(id, name, qty, price);

	        if (head == null) {
	            head = node;
	            return;
	        }

	        Item temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = node;
	        System.out.println("Item added at end.");
	    }

	    //Adding item at a specific position
	    public void addAtPosition(int position, int id, String name, int qty, double price) {

	        if (position == 1) {
	            addAtBeginning(id, name, qty, price);
	            return;
	        }

	        Item node = new Item(id, name, qty, price);
	        Item temp = head;

	        for (int i = 1; i < position - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Invalid position.");
	            return;
	        }

	        node.next = temp.next;
	        temp.next = node;
	        System.out.println("Item added at position " + position);
	    }

	    //Removing item by Item ID
	    public void removeById(int id) {

	        if (head == null) {
	            System.out.println("Inventory is empty.");
	            return;
	        }

	        if (head.itemId == id) {
	            head = head.next;
	            System.out.println("Item removed.");
	            return;
	        }

	        Item temp = head;
	        while (temp.next != null && temp.next.itemId != id) {
	            temp = temp.next;
	        }

	        if (temp.next == null) {
	            System.out.println("Item not found.");
	        } else {
	            temp.next = temp.next.next;
	            System.out.println("Item removed.");
	        }
	    }

	    //Updating quantity by Item ID
	    public void updateQuantity(int id, int newQty) {

	        Item temp = head;

	        while (temp != null) {
	            if (temp.itemId == id) {
	                temp.quantity = newQty;
	                System.out.println("Quantity updated.");
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Item not found.");
	    }

	    //Searching by Item ID
	    public void searchById(int id) {

	        Item temp = head;

	        while (temp != null) {
	            if (temp.itemId == id) {
	                displayItem(temp);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Item not found.");
	    }

	    //Searching by Item Name
	    public void searchByName(String name) {

	        Item temp = head;
	        boolean found = false;

	        while (temp != null) {
	            if (temp.itemName.equalsIgnoreCase(name)) {
	                displayItem(temp);
	                found = true;
	            }
	            temp = temp.next;
	        }

	        if (!found) {
	            System.out.println("Item not found.");
	        }
	    }

	    //Calculating total inventory value
	    public void calculateTotalValue() {

	        double total = 0;
	        Item temp = head;

	        while (temp != null) {
	            total += temp.quantity * temp.price;
	            temp = temp.next;
	        }

	        System.out.println("Total Inventory Value: " + total);
	    }

	    //Sorting by Item Name 
	    public void sortByName(boolean ascending) {

	        if (head == null) return;

	        for (Item i = head; i.next != null; i = i.next) {
	            for (Item j = i.next; j != null; j = j.next) {

	                if ((ascending && i.itemName.compareToIgnoreCase(j.itemName) > 0) ||
	                    (!ascending && i.itemName.compareToIgnoreCase(j.itemName) < 0)) {

	                    swapData(i, j);
	                }
	            }
	        }
	        System.out.println("Inventory sorted by name.");
	    }

	    //Sorting by Price 
	    public void sortByPrice(boolean ascending) {

	        if (head == null) return;

	        for (Item i = head; i.next != null; i = i.next) {
	            for (Item j = i.next; j != null; j = j.next) {

	                if ((ascending && i.price > j.price) ||
	                    (!ascending && i.price < j.price)) {

	                    swapData(i, j);
	                }
	            }
	        }
	        System.out.println("Inventory sorted by price.");
	    }

	    //Displaying all items
	    public void displayAll() {

	        if (head == null) {
	            System.out.println("Inventory is empty.");
	            return;
	        }

	        Item temp = head;
	        System.out.println("\nID  Name   Qty  Price");

	        while (temp != null) {
	            System.out.println(
	                    temp.itemId + "  " +
	                    temp.itemName + "  " +
	                    temp.quantity + "   " +
	                    temp.price
	            );
	            temp = temp.next;
	        }
	    }

	    //Helper method to swap data
	    private void swapData(Item a, Item b) {

	        int id = a.itemId;
	        String name = a.itemName;
	        int qty = a.quantity;
	        double price = a.price;

	        a.itemId = b.itemId;
	        a.itemName = b.itemName;
	        a.quantity = b.quantity;
	        a.price = b.price;

	        b.itemId = id;
	        b.itemName = name;
	        b.quantity = qty;
	        b.price = price;
	    }

	    //Helper method to display one item
	    private void displayItem(Item i) {
	        System.out.println("ID: " + i.itemId + ", Name: " + i.itemName + ", Quantity: " + i.quantity + ", Price: " + i.price);
	    }
	}

