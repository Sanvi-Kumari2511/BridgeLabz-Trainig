package com.csvdatahandling.detectduplicates;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class DetectDuplicates {
	public static void main(String[] args) {

		String filePath = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\csvdatahandling\\detectduplicates\\question12\\student.csv";
        String line;

        // Map to store ID and all records with that ID
        Map<Integer, List<String>> duplicateMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header row
            br.readLine();

            while ((line = br.readLine()) != null) {

                // Skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                // Split CSV row
                String[] data = line.split(",");

                // Ensure ID column exists
                if (data.length < 1) {
                    System.out.println("Invalid row format: " + line);
                    continue;
                }

                // Clean ID value
                String idStr = data[0].trim();

                // Validate numeric ID
                if (!idStr.matches("\\d+")) {
                    System.out.println("Invalid ID, skipping row: " + line);
                    continue;
                }

                // Convert ID to Integer
                int id = Integer.parseInt(idStr);

                // Store record for duplicate detection
                duplicateMap
                        .computeIfAbsent(id, k -> new ArrayList<>())
                        .add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Duplicate Records:");
        System.out.println("------------------");

        boolean foundDuplicate = false;

        // Identify duplicate IDs
        for (Map.Entry<Integer, List<String>> entry : duplicateMap.entrySet()) {

            if (entry.getValue().size() > 1) {
                foundDuplicate = true;

                System.out.println("Duplicate ID: " + entry.getKey());
                for (String record : entry.getValue()) {
                    System.out.println(record);
                }
                System.out.println("------------------");
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate records found.");
        }
    }
}