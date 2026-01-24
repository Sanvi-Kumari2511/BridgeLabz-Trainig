package com.csvdatahandling.readandprintdata;

import java.util.*;

public class CSVReaderApp {
    public static void main(String[] args) {

        // CSV file path
        String path = "src/students.csv";

        // Read CSV
        List<Student> students = CSVReader.readCSV(path);

        // Print data
        System.out.println("Student Details:");
        System.out.println("-----------------");
        for (Student s : students) {
            s.show();
        }
    }
}
