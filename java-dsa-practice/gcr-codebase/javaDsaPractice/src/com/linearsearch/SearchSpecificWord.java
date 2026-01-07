package com.linearsearch;

public class SearchSpecificWord {
	
	    //Method to search for the first sentence containing the word
	    public static String searchSentence(String[] sentences, String word) {

	        //Traversing each sentence using linear search
	        for (int i = 0; i < sentences.length; i++) {

	            //Check if the sentence contains the given word
	            if (sentences[i].toLowerCase().contains(word.toLowerCase())) {
	                return sentences[i]; 
	            }
	        }

	        //If word is not found in any sentence
	        return "Word not found";
	    }

	    public static void main(String[] args) {

	        String[] sentences = {
	                "My name is Sanvi",
	                "I love singing",
	                "I'm a simple girl"
	        };

	        String word = "Sanvi";

	        String result = searchSentence(sentences, word);

	        System.out.println("Result: " + result);
	    }
	}

