package com.javagenerics.smartwarehouse;
import java.util.*;

public class SmartHouseSystem {
	//Wildcard method to display an
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

    	
    	//Storage for Electronics
        Storage<Electronics> electronics = new Storage<>();
        electronics.addItem(new Electronics("Laptop"));
        electronics.addItem(new Electronics("Mobile"));

        //Storage for Groceries
        Storage<Groceries> groceries = new Storage<>();
        groceries.addItem(new Groceries("Bread"));
        groceries.addItem(new Groceries("Milk"));

        //Storage for Furniture
        Storage<Furniture> furniture = new Storage<>();
        furniture.addItem(new Furniture("Table"));
        furniture.addItem(new Furniture("Chair"));

        //Displaying results
        System.out.println("Electronics Storage:");
        displayItems(electronics.getItems());

        System.out.println("\nGroceries Storage:");
        displayItems(groceries.getItems());

        System.out.println("\nFurniture Storage:");
        displayItems(furniture.getItems());
    }
}
