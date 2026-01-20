package com.javacollections.javastreams;
import java.io.*;

public class UppercaseToLowercase {

	    public static void main(String[] args) {

	        //Source file (input)
	        String inputFile = "input.txt";
	        //Destination file (output)
	        String outputFile = "output.txt";

	        
	        try (
	                //FileReader: reads characters from file
	                FileReader fr = new FileReader(inputFile);
	        		
	                //BufferedReader: efficient reading
	                BufferedReader br = new BufferedReader(fr);

	                //FileWriter: writes characters to file
	                FileWriter fw = new FileWriter(outputFile);
	        		
	                //BufferedWriter: efficient writing
	                BufferedWriter bw = new BufferedWriter(fw);
	        )
	        {
	            String line;

	           
	            //Read each line, convert, write
	           
	            while ((line = br.readLine()) != null) {
	                String lowerCaseLine = line.toLowerCase(); 
	                bw.write(lowerCaseLine);                   
	                bw.newLine();                              
	            }

	            System.out.println("File converted to lowercase successfully: " + outputFile);

	        } 
	        catch (IOException e) {
	            System.out.println("Error occurred: " + e.getMessage());
	        }
	  }
}
