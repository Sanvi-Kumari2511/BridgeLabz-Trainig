package com.csvdatahandling.filterrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {
	 public static void main(String[] args) {

		    //CSV file path
	        String filePath = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\csvdatahandling\\filterrecords\\question4\\student.csv";
	        String line;

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

	            //Skip header
	            br.readLine();

	            System.out.println("Students with marks greater than 90:");
	            System.out.println("------------------------------------");

	            while ((line = br.readLine()) != null) {

	                String[] data = line.split(",");

	                int id = Integer.parseInt(data[0]);
	                String name = data[1];
	                int age = Integer.parseInt(data[2]);
	                int marks = Integer.parseInt(data[3]);

	                if (marks > 90) {
	                    System.out.println("ID    : " + id);
	                    System.out.println("Name  : " + name);
	                    System.out.println("Age   : " + age);
	                    System.out.println("Marks : " + marks);
	                    System.out.println("------------------------");
	                }
	            }

	        } 
	        
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
