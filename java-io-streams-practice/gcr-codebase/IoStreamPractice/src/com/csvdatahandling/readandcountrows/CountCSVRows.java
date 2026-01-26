package com.csvdatahandling.readandcountrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
	public static void main(String[] args) {

		//CSV file path
        String filePath = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\csvdatahandling\\readandcountrows\\question3\\student.csv";
        String line;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            //Skip header row
            br.readLine();

            //Read file line by line
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count++;
                }
            }

            //Printing total count
            System.out.println("Total number of records (excluding header): " + count);

        } 
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

