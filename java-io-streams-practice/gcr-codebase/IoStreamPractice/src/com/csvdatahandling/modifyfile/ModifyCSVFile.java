package com.csvdatahandling.modifyfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyCSVFile {
	 public static void main(String[] args) {

	        String inputFile = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\csvdatahandling\\modifyfile\\question6\\input.csv";
	        String outputFile = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\csvdatahandling\\modifyfile\\question6\\output.csv";
	        String line;

	        try (
	            BufferedReader br = new BufferedReader(new FileReader(inputFile));
	            FileWriter writer = new FileWriter(outputFile)) {

	            //Read and write header
	            writer.write(br.readLine() + "\n");

	            while ((line = br.readLine()) != null) {

	                String[] data = line.split(",");

	                int id = Integer.parseInt(data[0]);
	                String name = data[1];
	                String department = data[2];
	                double salary = Double.parseDouble(data[3]);

	                //Increasing salary by 5% for IT department
	                if (department.equalsIgnoreCase("IT")) {
	                    salary = salary + (salary * 0.05);
	                }

	                writer.write(id + "," + name + "," + department + "," + salary + "\n");
	            }

	            System.out.println("CSV file updated successfully.");

	        } 
	        
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
