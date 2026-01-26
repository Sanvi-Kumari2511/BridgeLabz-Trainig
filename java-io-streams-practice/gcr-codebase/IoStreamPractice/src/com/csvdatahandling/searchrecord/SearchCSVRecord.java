package com.csvdatahandling.searchrecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchCSVRecord {
	public static void main(String[] args) {

		//CSV file path
        String filePath = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\csvdatahandling\\searchrecord\\question5\\employee.csv";
        String line;
        boolean found = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String searchName = scanner.nextLine().trim();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            //Skip header row
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[1];

                //Check name match or not
                if (name.equalsIgnoreCase(searchName)) {
                    String department = data[2];
                    String salary = data[3];

                    System.out.println("Employee Found");
                    System.out.println("Department : " + department);
                    System.out.println("Salary     : " + salary);

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found.");
            }

        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            scanner.close();
        }
    }
}
