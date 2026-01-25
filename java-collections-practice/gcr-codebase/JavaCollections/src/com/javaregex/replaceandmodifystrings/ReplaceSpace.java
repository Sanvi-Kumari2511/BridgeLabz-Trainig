package com.javaregex.replaceandmodifystrings;

public class ReplaceSpace {
   public static void main(String args []) {
	   String text = "This  is   an example    with multiple spaces.";
	   
	   //Replacing multiple spaces with a single space
	   String modifiedText = text.replaceAll("\\s+", " ");
	   
	   System.out.println("Original Text: " + text);
	   
	   System.out.println();
	   
	   System.out.println("Modified Text: " + modifiedText);
   }
}
