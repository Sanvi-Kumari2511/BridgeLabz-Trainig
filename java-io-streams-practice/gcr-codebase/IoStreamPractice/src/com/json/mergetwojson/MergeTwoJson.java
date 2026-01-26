package com.json.mergetwojson;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;

public class MergeTwoJson {
	 public static void main(String[] args) {

	        try {
	            //Create Gson instance with pretty printing
	            Gson gson = new GsonBuilder()
	                    .setPrettyPrinting()
	                    .create();

	            //Reading first JSON file
	            JsonObject json1 = JsonParser
	                    .parseReader(new FileReader("D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\json\\mergetwojson\\sample\\json1.json"))
	                    .getAsJsonObject();

	            //Reading second JSON file
	            JsonObject json2 = JsonParser
	                    .parseReader(new FileReader("D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\json\\mergetwojson\\sample\\json2.json"))
	                    .getAsJsonObject();
	            
	            //Creating a new JsonObject
	            JsonObject mergedJson = new JsonObject();

	            //Adding all entries from first JSON
	            for (String key : json1.keySet()) {
	                mergedJson.add(key, json1.get(key));
	            }

	            //Adding all entries from second JSON(If already exist then override)
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
