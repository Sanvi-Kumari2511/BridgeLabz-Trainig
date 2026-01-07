package com.filereaderproblem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurrenceOfWord {

	    public static void main(String[] args) {

	    	    String fileName = "sample.txt";
	    	    String targetWord = "Sanvi";
	    	    int count = 0;

	    	    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

	    	         String line;

	    	    while ((line = br.readLine()) != null) {
	    	      String[] words = line.split("\\s+");
	    	    for (String word : words) {
	    	        if (word.equalsIgnoreCase(targetWord)) {
	    	           count++;
	    	                    }
	    	                }
	    	            }

	    	            //Final count
	    	            System.out.println("The word '" + targetWord + "' appears " + count + " times.");

	    	        } 
	    	    catch (IOException e) {
	    	            System.out.println("File not found or cannot be read.");
	    	        }
	    	    }
	    	}
