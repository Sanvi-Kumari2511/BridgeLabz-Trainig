package com.javaregex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSocialsecurityNumber {
	 public static void main(String[] args) {

	        String text1 = "My SSN is 123-45-6789.";
	        String text2 = "My SSN is 123456789.";

	        //Regex pattern 
	        String ssnRegex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

	        validateSSN(text1, ssnRegex);
	        validateSSN(text2, ssnRegex);
	    }

	    private static void validateSSN(String text, String regex) {
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(text);

	        if (matcher.find()) {
	            System.out.println(matcher.group() + " → Valid SSN");
	        } 
	        
	        else {
	            System.out.println("No valid SSN found in: \"" + text + "\"");
	        }
	    }
}
