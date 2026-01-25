package com.javaregex.basicproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
    public static void main(String args []) {
    	
    	//Regex pattern for hex color code
    	String hexColorRegex = "^#[0-9A-Fa-f]{6}$";
    			
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter hex color code: ");
    	String color = sc.nextLine();
    	
    	//Validate hex color code
    	if(Pattern.matches(hexColorRegex,  color)) {
    		System.out.println(color + " : Valid");
    	}
    	
    	else {
    		System.out.println(color + " : Invalid");
    	}
    }
}
