package com.javacollections.javastreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFile {

	    public static void main(String[] args) {

	        //path of large file 
	        String filePath = "largefile.txt";

	        
	        //BufferedReader setup
	      
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

	            String line;

	           
	            //Read file line by line
	           
	            while ((line = br.readLine()) != null) {

	                //Case-insensitive check for "error"
	                if (line.toLowerCase().contains("error")) {
	                    System.out.println(line);
	                }
	            }

	        } 
	        
	        catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	  }
}


