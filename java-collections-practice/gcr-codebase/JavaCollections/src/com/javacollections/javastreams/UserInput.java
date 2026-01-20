package com.javacollections.javastreams;

import java.io.*;

public class UserInput {
	 public static void main(String[] args) {

	        
	        String fileName = "user_info.txt";

	        //BufferedReader for console input
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        try {
	            //Taking input from user
	            System.out.print("Enter your name: ");
	            String name = br.readLine();

	            System.out.print("Enter your age: ");
	            String age = br.readLine();

	            System.out.print("Enter your favorite programming language: ");
	            String language = br.readLine();

	            //FileWriter to write data into file
	            FileWriter fw = new FileWriter(fileName);

	            fw.write("Name: " + name + "\n");
	            fw.write("Age: " + age + "\n");
	            fw.write("Favorite Language: " + language + "\n");

	            fw.close(); 

	            System.out.println("Data saved successfully in " + fileName);

	        } 
	        
	        catch (IOException e) {
	            System.out.println("Error occurred: " + e.getMessage());
	        } 
	        
	        finally {
	            
	        	try {
	                br.close(); 
	            } 
	        	
	        	catch (IOException e) {
	                System.out.println("Error closing BufferedReader");
	            }
	        }
	    }
}
