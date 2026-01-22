package com.javacollections.exception;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
     
	 public static void main(String args []) {
    	 
    	 try {
    		 
    		 //Attempt to read the file
    		 FileReader file = new FileReader("data.txt");
    		 BufferedReader br = new BufferedReader(file);
    		 
    		 String line;
    		 while((line = br.readLine()) != null) {
    		   System.out.println(line);
    		 }
    		 
    		 br.close();
    		 
    	 }
    	 
    	 catch(IOException e) {
    		 //Handles file not found 
    		 System.out.println("File not found");
    	 }
     }
}
