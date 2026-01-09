package com.algorithmruntimeanalysis;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class LargeFileReading {

	    public static void main(String[] args) throws IOException {

	        String filePath = "largefile.txt"; 
	        long start, end;

	        //Using FileReader
	        start = System.nanoTime();
	        FileReader fr = new FileReader(filePath);
	        
	        while (fr.read() != -1) {
	        }
	        
	        fr.close();
	        
	        end = System.nanoTime();
	        System.out.println("FileReader Time: " + (end - start) / 1000000.0 + " ms");

	        //Using InputStreamReader
	        start = System.nanoTime();
	        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
	        
	        while (isr.read() != -1) {
	        }
	        
	        isr.close();
	        
	        end = System.nanoTime();
	        System.out.println("InputStreamReader Time: " + (end - start) / 1000000.0 + " ms");
	    }
	}

