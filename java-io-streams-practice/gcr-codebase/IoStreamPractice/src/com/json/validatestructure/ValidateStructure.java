package com.json.validatestructure;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;


public class ValidateStructure {
	public static void main(String[] args) {

        try {
            //Parse JSON file into JsonElement
            JsonElement jsonElement = JsonParser.parseReader(new FileReader("D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\json\\validatestructure\\sample\\user.json"));

            //Check if root element is a JSON object
            if (!jsonElement.isJsonObject()) {
                System.out.println("Root element is not a JSON object");
                return;
            }

            //Convert JsonElement to JsonObject
            JsonObject jsonObject = jsonElement.getAsJsonObject();


            // Validate "name"
            if (!jsonObject.has("name") || !jsonObject.get("name").isJsonPrimitive()
                    || !jsonObject.get("name").getAsJsonPrimitive().isString()) {
            	
                System.out.println("Invalid or missing 'name'");
                return;
            }

            //Validate "age"
            if (!jsonObject.has("age") || !jsonObject.get("age").isJsonPrimitive()
                    || !jsonObject.get("age").getAsJsonPrimitive().isNumber()) {
            	
                System.out.println("Invalid or missing 'age'");
                return;
            }

            //Validate "email"
            if (!jsonObject.has("email") || !jsonObject.get("email").isJsonPrimitive()
                    || !jsonObject.get("email").getAsJsonPrimitive().isString()) {
            	
                System.out.println("Invalid or missing 'email'");
                return;
            }

            //Check email format
            String email = jsonObject.get("email").getAsString();
            if (!email.contains("@")) {
            	
                System.out.println("Invalid email format");
                return;
            }

            //If all validations pass print this statement
            System.out.println("JSON structure is valid");

        } 
        
        catch (Exception e) {
        	//If validations not pass print this statement
            System.out.println("Invalid JSON format");
            e.printStackTrace();
        }
    }
}
