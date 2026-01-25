package com.javaregex.extractionproblems;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class ExtractDates {
    public static void main(String args []) {
    	String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
    	
    	//Regex Pattern
    	String dateRegex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
    	
    	Pattern pattern = Pattern.compile(dateRegex);
    	Matcher matcher = pattern.matcher(text);
    	
    	List<String> date = new ArrayList<>();
    	
    	//Extract all matching dates
    	while(matcher.find()) {
    		date.add(matcher.group());
    	}
    	
    	//Printing dates 
    	System.out.println(String.join(", ", date));

    }
}
