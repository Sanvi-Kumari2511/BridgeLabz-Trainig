package com.json.readandextractfile;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;

public class ReadAndExtractFields {
	 public static void main(String[] args) {

	        try {
	            //Read JSON file using FileReader
	            FileReader reader = new FileReader("D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\json\\readandextractfile\\sample\\user.json");

	            //Parse the JSON file into a JsonElement
	            JsonElement jsonElement = JsonParser.parseReader(reader);

	            //Convert JsonElement into JsonArray 
	            JsonArray jsonArray = jsonElement.getAsJsonArray();

	            //Loop through each JSON object in the array
	            for (JsonElement element : jsonArray) {

	                //Convert JsonElement to JsonObject
	                JsonObject jsonObject = element.getAsJsonObject();

	                //Extract required fields
	                String name = jsonObject.get("name").getAsString();
	                String email = jsonObject.get("email").getAsString();

	                //Print extracted values
	                System.out.println("Name  : " + name);
	                System.out.println("Email : " + email);
	                System.out.println("------------------");
	            }

	        } catch (Exception e) {
	            //Handle file reading or parsing errors
	            e.printStackTrace();
	        }
	    }
}
