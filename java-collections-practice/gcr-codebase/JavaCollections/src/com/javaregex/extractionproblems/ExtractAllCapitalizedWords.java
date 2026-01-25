package com.javaregex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllCapitalizedWords {
    public static void main(String args []) {
    	
    	String sentence = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
    	
    	//Regex pattern
    	String CapitalizedRegex = "\\b[A-Z][a-zA-Z]*\\b";
    	
    	Pattern pattern = Pattern.compile(CapitalizedRegex);
    	Matcher matcher = pattern.matcher(sentence);
    	
    	System.out.println("Capitalized words:");
    	
    	while(matcher.find()) {
    		System.out.println(matcher.group());
    	}

    }
}
