package com.javacollections.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
	
	 public static void main(String[] args) {

	        String str = "Hello Sanvi, Say Hello!";

	        //Convert to lowercase and remove punctuation
	        str = str.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

	        String[] words = str.split("\\s+"); 

	        Map<String, Integer> wordCount = new HashMap<>();

	        //Counting frequency
	        for (String word : words) {
	            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	        }

	        //Displaying result
	        System.out.println(wordCount); 
	    }
}
