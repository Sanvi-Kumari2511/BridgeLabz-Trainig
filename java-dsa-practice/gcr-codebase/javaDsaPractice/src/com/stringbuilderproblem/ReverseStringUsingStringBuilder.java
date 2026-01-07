package com.stringbuilderproblem;

public class ReverseStringUsingStringBuilder {
	
	    public static void main(String[] args) {

	        String str = "hello";

	        //Creating StringBuilder and append string
	        StringBuilder sb = new StringBuilder();
	        sb.append(str);

	        //Reversing the string
	        sb.reverse();

	        //Converting back to String
	        String reversedString = sb.toString();

	        System.out.println("Original String is: " + str);
	        System.out.println("Reversed String is: " + reversedString);
	    }
	}

