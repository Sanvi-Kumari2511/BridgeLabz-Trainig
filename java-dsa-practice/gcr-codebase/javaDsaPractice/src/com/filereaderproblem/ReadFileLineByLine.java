package com.filereaderproblem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
	
	    public static void main(String[] args) {

	        try {
	            //FileReader
	            FileReader fr = new FileReader("Sample.txt");

	            //BufferedReader
	            BufferedReader br = new BufferedReader(fr);

	            String line;

	            //Reading line by line
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	            //Close the file
	            br.close();

	        } 
	        catch (IOException e) {
	            System.out.println("Error while reading the file");
	        }
	    }
	}

