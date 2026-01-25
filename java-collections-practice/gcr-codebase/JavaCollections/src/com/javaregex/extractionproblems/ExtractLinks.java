package com.javaregex.extractionproblems;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class ExtractLinks {
   public static void main(String args []) {
	   
	   String text = "Visit https://www.google.com and http://example.org for more info.";
	   
	   //Regex pattern
	   String linkRegex = "https?://[\\w.-]+(?:/\\s*)?";
	   
	   Pattern pattern = Pattern.compile(linkRegex);
	   Matcher matcher = pattern.matcher(text);
	   
	   List<String> links = new ArrayList<>();
	   
	   //Extract all links
	   while(matcher.find()) {
		   links.add(matcher.group());
	   }
 
	   //Printing links
	   System.out.println(String.join(", ", links));
   }
}    
