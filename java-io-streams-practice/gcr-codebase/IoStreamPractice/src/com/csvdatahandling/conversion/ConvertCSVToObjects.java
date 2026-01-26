package com.csvdatahandling.conversion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConvertCSVToObjects {
	 public static void main(String[] args) {

	        String filePath = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\csvdatahandling\\conversion\\question9\\student.csv";
	        String line;
	        List<Student> studentList = new ArrayList<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

	            //Skip header
	            br.readLine();

	            while ((line = br.readLine()) != null) {

	                String[] data = line.split(",");

	                int id = Integer.parseInt(data[0]);
	                String name = data[1];
	                int age = Integer.parseInt(data[2]);
	                int marks = Integer.parseInt(data[3]);

	                //Creating object
	                Student student = new Student(id, name, age, marks);
	                studentList.add(student);
	            }

	        } 
	        
	        catch (IOException e) {
	            e.printStackTrace();
	        }

	        //Displaying all Student objects
	        System.out.println("Student List:");
	        for (Student s : studentList) {
	            System.out.println(s);
	        }
	 }
}
