package com.javaregex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressExtraction {
   public static void main(String args []) {
	   String text = "Contact us at support@example.com and info@company.org";
	   
	   //Regex pattern for email address
	   String emailRegex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
	   
	   //Compile pattern
	   Pattern pattern = Pattern.compile(emailRegex);
	   Matcher matcher = pattern.matcher(text);
	   
	   System.out.println("Expected Email Addresses: ");
	   
	   while(matcher.find()) {
		   System.out.println(matcher.group());
	   }
   }
}
