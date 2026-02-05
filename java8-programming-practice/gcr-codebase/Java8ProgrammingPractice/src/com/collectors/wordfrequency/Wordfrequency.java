package com.collectors.wordfrequency;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Wordfrequency {
    public static void main(String args []) {
    	   String sentence = "My name is Sanvi Singh and my Hometown is Patna";
    	   
    	   Map<String, Integer> wordCount = 
    			   Arrays.stream(sentence.toLowerCase().split("\\s"))
    			         .collect(Collectors.toMap(
    			        		 word -> word,
    			        		 word -> 1,
    			        		 Integer::sum
    			          ));
    			          
    	   wordCount.forEach((word, count) -> System.out.println(word + " : " + count));
                    
    }
}
