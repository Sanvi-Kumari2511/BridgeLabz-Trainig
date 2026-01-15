package com.smartshelf;

public class SmartShelf {
	
	//Method to arrange books alphabetically by title
    static void insertionSort(Book[] books) {
    	int number = books.length;
    	
    	//Start checking from second book because first one is already sorted
    	for(int i = 1; i < number; i++) {
    		Book key = books[i];
    		int j = i - 1;
    		
    		//Shift books that are alphabetically greater than key
    		while(j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
    			
    			//Shifting book one position right
    			books[j + 1] = books[j];
    			
    			//Move to previous index
    			j--;
    		}
    		
    		//Insert key book at correct position
    		books[j + 1] = key;
    	}
    }
}
