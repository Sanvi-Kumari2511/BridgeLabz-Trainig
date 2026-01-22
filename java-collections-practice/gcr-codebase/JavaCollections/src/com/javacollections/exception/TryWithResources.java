package com.javacollections.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	public static void main(String[] args) {

        //Using try-with-resources to automatically close the BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {

            // Read and print the first line
            String firstLine = br.readLine();
            System.out.println(firstLine);

        } 
        
        catch (IOException e) {
            //Handle file not found 
            System.out.println("Error reading file");
        }
	}
}
