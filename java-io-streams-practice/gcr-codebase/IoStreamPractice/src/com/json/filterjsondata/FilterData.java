package com.json.filterjsondata;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;

public class FilterData {
	  public static void main(String[] args) {

	        try {
	            // Parse JSON file into JsonElement
	            JsonElement jsonElement =
	                    JsonParser.parseReader(new FileReader("D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\json\\filterjsondata\\sample\\user.json"));

	            // Convert root element to JsonArray
	            JsonArray jsonArray = jsonElement.getAsJsonArray();

	            System.out.println("Users older than 25:");
	            System.out.println("---------------------");

	            // Iterate through each JSON object
	            for (JsonElement element : jsonArray) {

	                JsonObject user = element.getAsJsonObject();

	                // Check if age field exists and is a number
	                if (user.has("age") && user.get("age").isJsonPrimitive()
	                        && user.get("age").getAsJsonPrimitive().isNumber()) {

	                    int age = user.get("age").getAsInt();

	                    // Apply filter condition
	                    if (age > 25) {

	                        // Print filtered user details
	                        System.out.println("Name  : " + user.get("name").getAsString());
	                        System.out.println("Age   : " + age);
	                        System.out.println("Email : " + user.get("email").getAsString());
	                        System.out.println("---------------------");
	                    }
	                }
	            }

	        } catch (Exception e) {
	            // Handles file not found or invalid JSON
	            e.printStackTrace();
	        }
	    }
}
