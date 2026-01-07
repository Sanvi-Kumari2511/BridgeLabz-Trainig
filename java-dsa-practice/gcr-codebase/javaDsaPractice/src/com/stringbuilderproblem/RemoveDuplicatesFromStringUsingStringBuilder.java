package com.stringbuilderproblem;
import java.util.HashSet;

public class RemoveDuplicatesFromStringUsingStringBuilder {
	
	    public static void main(String[] args) {

	        String str = "java";

	        String removed = removeDuplicates(str);

	        System.out.println("Original String is: " + str);
	        System.out.println("String after removing duplicates: " + removed);
	    }

	    public static String removeDuplicates(String str) {

	        //StringBuilder to store result
	        StringBuilder sb = new StringBuilder();

	        //HashSet to track characters
	        HashSet<Character> seen = new HashSet<>();

	        //Traversing string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            //Append if not already seen
	            if (!seen.contains(ch)) {
	                sb.append(ch);
	                seen.add(ch);
	            }
	        }

	        //Converting to String
	        return sb.toString();
	    }
	}

