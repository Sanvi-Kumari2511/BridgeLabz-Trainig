package com.challengeproblem;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class CompareFileReaderAndInputStreamReader {

	    public static void main(String[] args) {

	        String fileName = "largefile.txt"; 
	        int wordCount;

	        wordCount = 0;
	        
	        try {
	            FileReader fr = new FileReader(fileName);
	            BufferedReader br = new BufferedReader(fr);

	            long startTime = System.nanoTime(); 
	            String line;

	            while ((line = br.readLine()) != null) {
	                String[] words = line.split("\\s+");
	                wordCount += words.length;
	            }

	            long endTime = System.nanoTime();  
	            br.close();

	            System.out.println("Word count using FileReader: " + wordCount);
	            System.out.println("Time taken by FileReader: " + (endTime - startTime) + " ns");

	        }
	        catch (IOException e) {
	            System.out.println("Error reading file with FileReader: " + e.getMessage());
	        }

	        wordCount = 0;
	        try {
	            FileInputStream fis = new FileInputStream(fileName);
	            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
	            BufferedReader br = new BufferedReader(isr);

	            long startTime = System.nanoTime();
	            String line;

	            while ((line = br.readLine()) != null) {
	                String[] words = line.split("\\s+");
	                wordCount += words.length;
	            }

	            long endTime = System.nanoTime();
	            br.close();

	            System.out.println("Word count using InputStreamReader: " + wordCount);
	            System.out.println("Time taken by InputStreamReader: " + (endTime - startTime) + " ns");

	        }
	        catch (IOException e) {
	            System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
	        }
	    }
	}