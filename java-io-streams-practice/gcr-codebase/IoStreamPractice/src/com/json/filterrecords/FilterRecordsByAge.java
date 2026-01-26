package com.json.filterrecords;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;

public class FilterRecordsByAge {
	public static void main(String[] args) {

        try {
            //Read and parse JSON file
            JsonElement jsonElement = JsonParser.parseReader(new FileReader("D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\json\\filterrecords\\sample\\user.json"));

            //Convert root element into JsonArray
            JsonArray jsonArray = jsonElement.getAsJsonArray();

            System.out.println("Users with age > 25:");
            System.out.println("--------------------");

            //Loop through each JSON object in the array
            for (JsonElement element : jsonArray) {

                JsonObject user = element.getAsJsonObject();

                //Check "age" field is present or not and is a number or not
                if (user.has("age") && user.get("age").isJsonPrimitive() && user.get("age").getAsJsonPrimitive().isNumber()) {

                    int age = user.get("age").getAsInt();

                    //Filter condition
                    if (age > 25) {

                        //Displaying filtered records
                        System.out.println("Name  : " + user.get("name").getAsString());
                        System.out.println("Age   : " + age);
                        System.out.println("Email : " + user.get("email").getAsString());
                        System.out.println("--------------------");
                    }
                }
            }

        }
        catch (Exception e) {
           
        	//Handles invalid or not found files
            e.printStackTrace();
        }
    }
}
