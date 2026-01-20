package com.stringmanipulation;
import java.util.Scanner;

public class StringManipulation {
    public static String cleanseAndInvert(String str) {
    	if(str.length()<=6 || str==null) {
    		return "";
    	}
    	
    	for(int i=0; i<str.length(); i++) {
    		char ch=str.charAt(i);
    		if(!Character.isLetter(ch)) {
    			return "";
    		}
    		
    		str=str.toLowerCase();
    	}
    	
    	StringBuilder sb=new StringBuilder();
    	for(int i=0; i<str.length(); i++) {
    		char ch=str.charAt(i);
    		if(ch%2 != 0) {
    			sb.append(ch);
    		}
    	}
    	
    	
    	sb.reverse();

    	 for (int i = 0; i < sb.length(); i++) {
             if (i % 2 == 0) {
                 sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
             }
    	}
    	
    	return sb.toString();
    }
    public static void main(String args []) {
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter a word: ");
    	
    	String word=sc.nextLine();
    	
    	String result=cleanseAndInvert(word);
    	
    	if(result.equals("")) {
    		System.out.println("Invalid input");
    	}
    	else {
    		System.out.println("The generated key is - " + result);
    	}
    	
    }
    
}
