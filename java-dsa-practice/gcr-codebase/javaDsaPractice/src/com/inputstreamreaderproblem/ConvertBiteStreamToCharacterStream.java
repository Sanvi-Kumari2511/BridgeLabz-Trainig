package com.inputstreamreaderproblem;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ConvertBiteStreamToCharacterStream {

	    public static void main(String[] args) {

	        String fileName = "sample.txt";

	        try {
	            //Byte stream
	            FileInputStream fis = new FileInputStream(fileName);

	            //Convert byte stream to character stream 
	            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

	            //BufferedReader for efficiency
	            BufferedReader br = new BufferedReader(isr);

	            String line;

	            //Read line by line
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	            //Close resources
	            br.close();

	        } 
	        catch (IOException e) {
	            System.out.println("Error while reading the file");
	        }
	    }
	}

