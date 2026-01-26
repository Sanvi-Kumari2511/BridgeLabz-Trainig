package com.json.conversioncsvtojson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class ConvertCsvTojson {
	public static void main(String[] args) {

        String csvFile = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\json\\conversioncsvtojson\\sample\\user.csv";
        String line;

        List<Map<String, String>> jsonList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            //Read header line
            String[] headers = br.readLine().split(",");

            //Read remaining rows
            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");
                Map<String, String> jsonMap = new LinkedHashMap<>();

                for (int i = 0; i < headers.length; i++) {
                    jsonMap.put(headers[i], values[i]);
                }

                jsonList.add(jsonMap);
            }

            //Convert list to JSON
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonOutput = gson.toJson(jsonList);

            //Displaying JSON
            System.out.println(jsonOutput);

        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
