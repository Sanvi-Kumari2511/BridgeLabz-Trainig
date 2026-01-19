package com.geomeasuresolutions;

public class LineUtils {
	
	    //Comparing two lines
	    public static void compareLines(Line l1, Line l2) {
	        double len1 = l1.length();
	        double len2 = l2.length();

	        if (len1 == len2) {
	            System.out.println("The two lines are equal in length (" + len1 + ")");
	        } 
	        
	        else if (len1 > len2) {
	            System.out.println("Line 1 is longer (" + len1 + " > " + len2 + ")");
	        } 
	        
	        else {
	            System.out.println("Line 2 is longer (" + len2 + " > " + len1 + ")");
	        }
	   }
}

