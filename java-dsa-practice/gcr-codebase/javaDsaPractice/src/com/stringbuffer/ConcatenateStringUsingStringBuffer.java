package com.stringbuffer;

public class ConcatenateStringUsingStringBuffer {
	  
	public static String concatenateStrings(String[] arr) {

        //Creating StringBuffer
        StringBuffer sb = new StringBuffer();

        //Append each string
        for (String str : arr) {
            sb.append(str);
        }

        //Converting to String
        return sb.toString();
    }
	
	    public static void main(String[] args) {

	        String[] str = {"I", " ", "am", " ", "Sanvi"};

	        String result = concatenateStrings(str);

	        System.out.println("Concatenated String: " + result);
	    }
	}
