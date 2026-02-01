package com.lamdaexpression.ecommercecustomsorting;
import java.util.*;

public class EcommerceSorting {
	public static void main(String[] args) {

		//Creating a list to store product objects
		List<Product> products = new ArrayList<>();

        products.add(new Product("T-Shirt", 500, 4.5, 5));
        products.add(new Product("Trouser", 1000, 4.8, 10));
        products.add(new Product("Shirt", 800, 3.9, 6));

        //Sort product by Price in low to high order
        products.sort((p1, p2) -> p1.price - p2.price);
        System.out.println("Product sorted by Price:");
        
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
        
        //Sort by Rating in high to low order
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }

        //Sort by Discount in high to low order
        products.sort((p1, p2) -> p2.discount - p1.discount);
        System.out.println("\nSorted by Discount:");
        
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }
}