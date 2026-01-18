package com.javacollections.votingsystem;
import java.util.*;

public class ShoppingCart {
	 public static void main(String[] args) {

	        //HashMap to store product prices
	        Map<String, Integer> priceMap = new HashMap<>();
	        priceMap.put("Rice", 50);
	        priceMap.put("Sugar", 20);
	        priceMap.put("Milk", 60);
	        priceMap.put("Bread", 40);

	        //LinkedHashMap to maintain order of items added to cart
	        Map<String, Integer> cart = new LinkedHashMap<>();

	        addToCart(cart, priceMap, "Rice");
	        addToCart(cart, priceMap, "Milk");
	        addToCart(cart, priceMap, "Bread");

	        System.out.println("Items in Cart (Insertion Order):");
	        System.out.println(cart);

	        //TreeMap to display items sorted by price
	        Map<Integer, List<String>> sortedByPrice = new TreeMap<>();

	        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
	            sortedByPrice
	                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
	                .add(entry.getKey());
	        }

	        System.out.println("\nItems Sorted by Price:");
	        System.out.println(sortedByPrice);
	    }

	    //Adding item to cart
	    private static void addToCart(Map<String, Integer> cart,
	                                  Map<String, Integer> priceMap,
	                                  String product) {
	        cart.put(product, priceMap.get(product));
	  }
}
