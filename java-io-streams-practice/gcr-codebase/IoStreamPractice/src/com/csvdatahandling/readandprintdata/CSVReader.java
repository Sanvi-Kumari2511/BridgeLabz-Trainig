package com.csvdatahandling.readandprintdata;

import java.io.*;
import java.util.*;

public class CSVReader {

    // Method to read CSV file and return a list of Student objects
    public static List<Student> readCSV(String filePath) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true; // Skip header

            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                // Split line by comma
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                int age = Integer.parseInt(parts[2].trim());
                int marks = Integer.parseInt(parts[3].trim());

                // Create student object and add to list
                students.add(new Student(id, name, age, marks));
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }

        return students;
    }
}
