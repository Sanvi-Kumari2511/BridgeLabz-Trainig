package com.json.mergetwojsonfiles;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;

public class MergeTwoFilesIntoJsonObject {
	 public static void main(String[] args) {

	        try {
	            //Creating Gson instance with pretty printing
	            Gson gson = new GsonBuilder()
	                    .setPrettyPrinting()
	                    .create();

	            //Reading first JSON file
	            JsonObject json1 = JsonParser
	                    .parseReader(new FileReader("D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\json\\mergetwojsonfiles\\sample\\file1.json"))
	                    .getAsJsonObject();

	            //Reading second JSON file
	            JsonObject json2 = JsonParser
	                    .parseReader(new FileReader("D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\json\\mergetwojsonfiles\\sample\\file2.json"))
	                    .getAsJsonObject();

	            //Creating new JsonObject for merged result
	            JsonObject mergedJson = new JsonObject();

	            // Add all entries from first JSON file
	            for (String key : json1.keySet()) {
	                mergedJson.add(key, json1.get(key));
	            }

	            //Adding all entries from second JSON file
	            for (String key : json2.keySet()) {
	                mergedJson.add(key, json2.get(key));
	            }

	            //Displaying merged JSON
	            System.out.println(gson.toJson(mergedJson));

	        } 
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
} 
