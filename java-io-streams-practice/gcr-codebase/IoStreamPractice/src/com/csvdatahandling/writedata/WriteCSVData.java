package com.csvdatahandling.writedata;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVData {
	 public static void main(String[] args) {

	        String filePath = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\csvdatahandling\\writedata\\question2\\employee.csv";

	        try (FileWriter writer = new FileWriter(filePath)) {

	            //Writing header
	            writer.append("ID,Name,Department,Salary\n");

	            //Employee records
	            writer.append("101,Rahul,IT,55000\n");
	            writer.append("102,Anita,HR,48000\n");
	            writer.append("103,Aman,Finance,60000\n");
	            writer.append("104,Priya,Marketing,52000\n");
	            writer.append("105,Rohit,Sales,50000\n");

	            System.out.println("CSV file created and data written successfully.");

	        }
	        
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
