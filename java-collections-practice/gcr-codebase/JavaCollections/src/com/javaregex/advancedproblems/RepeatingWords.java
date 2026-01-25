package com.javaregex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.LinkedHashSet;
import java.util.Set;

public class RepeatingWords {
	 public static void main(String[] args) {

	        String text = "This is is a repeated repeated word test.";

	        //Regex pattern 
	        String regex = "\\b(\\w+)\\s+\\1\\b";

	        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(text);

	        //LinkedHashSet to maintain order and remove duplicates
	        Set<String> repeatingWords = new LinkedHashSet<>();

	        while (matcher.find()) {
	            repeatingWords.add(matcher.group(1));
	        }

	        //Printing repeating words
	        System.out.println(String.join(", ", repeatingWords));
	    }
}
