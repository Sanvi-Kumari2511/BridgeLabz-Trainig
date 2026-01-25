package com.javaregex.replaceandmodifystrings;

import java.util.Arrays;
import java.util.List;

public class CensorBadWords {
   public static void main(String args []) {
	   String text = "This is a damn bad example with some stupid words.";
	   
	   //Bad words list
	   List<String> badWords = Arrays.asList("damn", "stupid");
	   
	   String censoredText = text;
	   
	   for(String badWord : badWords) {
		   
		   //Regex pattern to match the bad words
		   String badWordregex = "\\b" + badWord + "\\b";
		   censoredText = censoredText.replaceAll("(?i)" + badWordregex,  "****");
	   }
	   
	   System.out.println("Original Text: " + text);
	   
	   System.out.println();
	   
	   System.out.println("censored Text: " + censoredText);
	   
   }
}
