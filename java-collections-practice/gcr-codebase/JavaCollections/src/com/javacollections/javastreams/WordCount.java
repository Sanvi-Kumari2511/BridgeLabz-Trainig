package com.javacollections.javastreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCount {

	    public static void main(String[] args) {

	        String filePath = "sample.txt"; 
	        HashMap<String, Integer> wordCountMap = new HashMap<>();

	      
	        //Read file
	         try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

	            String line;

	            while ((line = br.readLine()) != null) {

	                //Convert to lowercase and remove special characters
	                line = line.toLowerCase().replaceAll("[^a-z ]", "");

	                //Split line into words
	                String[] words = line.split("\\s+");

	                //Count words
	                for (String word : words) {
	                    if (!word.isEmpty()) {
	                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
	                    }
	                }
	            }

	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	            return;
	        }

	        
	        //Sort by frequency
	       
	        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCountMap.entrySet());

	        list.sort((a, b) -> b.getValue() - a.getValue()); 

	       
	        //Display Top 5 Words
	       
	        System.out.println("Top 5 most frequent words:");
	        for (int i = 0; i < Math.min(5, list.size()); i++) {
	            System.out.println(list.get(i).getKey() + " → " + list.get(i).getValue());
	        }
	  }
}


