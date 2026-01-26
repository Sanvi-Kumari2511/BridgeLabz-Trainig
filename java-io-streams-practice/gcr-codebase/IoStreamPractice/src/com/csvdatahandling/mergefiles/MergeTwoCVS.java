package com.csvdatahandling.mergefiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoCVS {
	public static void main(String[] args) {

        String file1 = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\csvdatahandling\\mergefiles\\question10\\student1.csv";
        String file2 = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\csvdatahandling\\mergefiles\\question10\\student2.csv";
        String outputFile = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\csvdatahandling\\mergefiles\\question10\\merged_student.csv";

        Map<Integer, String[]> studentMap = new HashMap<>();

        //Read first CSV 
        try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {

            String line;
            //Skip header
            br1.readLine(); 

            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                studentMap.put(id, new String[]{data[1], data[2]});
            }

        } 
        
        catch (IOException e) {
            e.printStackTrace();
        }

        //Read second CSV 
        try (BufferedReader br2 = new BufferedReader(new FileReader(file2));
             FileWriter writer = new FileWriter(outputFile)) {

            //Header to merged CSV
            writer.write("ID,Name,Age,Marks,Grade\n");

            String line;
            //Skip header
            br2.readLine(); 

            while ((line = br2.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);

                //Check students id is matching or not
                if (studentMap.containsKey(id)) {
                    String[] studentInfo = studentMap.get(id);
                    String name = studentInfo[0];
                    String age = studentInfo[1];
                    String marks = data[1];
                    String grade = data[2];

                    writer.write(id + "," + name + "," + age + "," + marks + "," + grade + "\n");
                }
            }

            
            //Printing merged CSV files
            System.out.println("CSV files merged successfully.");

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
