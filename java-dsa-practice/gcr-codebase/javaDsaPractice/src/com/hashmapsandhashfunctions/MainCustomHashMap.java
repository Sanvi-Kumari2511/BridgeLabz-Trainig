package com.hashmapsandhashfunctions;

public class MainCustomHashMap {

	    public static void main(String[] args) {

	        //Creating custom hash map
	        CustomHashMap map = new CustomHashMap(5);

	        //Inserting values
	        map.put("Book", 300);
	        map.put("Copy", 100);
	        map.put("Pen", 50);

	        //Retrieving values
	        System.out.println("Book: " + map.get("Book"));
	        System.out.println("Copy: " + map.get("Copy"));
	        System.out.println("Pen: " + map.get("Pen"));

	        //Updating value
	        map.put("Book", 600);
	        System.out.println("Book after updated: " + map.get("Book"));

	        //Removing key
	        map.remove("Copy");
	        System.out.println("Copy after removal: " + map.get("Copy"));
	        
	    }
	}

