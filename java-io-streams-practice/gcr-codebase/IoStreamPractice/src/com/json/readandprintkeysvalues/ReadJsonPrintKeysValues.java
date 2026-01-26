package com.json.readandprintkeysvalues;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.util.Map;

public class ReadJsonPrintKeysValues {
	public static void main(String[] args) {

        try {
            //Parse JSON file into JsonElement
            JsonElement jsonElement = JsonParser.parseReader(new FileReader("D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\json\\readandprintkeysvalues\\sample\\data.json"));

            //Check if root element is a JSON array
            if (jsonElement.isJsonArray()) {

                JsonArray jsonArray = jsonElement.getAsJsonArray();

                //Loop through each JSON object in the array
                for (JsonElement element : jsonArray) {
                    printJsonObject(element.getAsJsonObject());
                    System.out.println("--------------------");
                }

            }
            //Check if root element is a single JSON object
            else if (jsonElement.isJsonObject()) {

                printJsonObject(jsonElement.getAsJsonObject());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    //Prints all keys and values of a JsonObject
    private static void printJsonObject(JsonObject jsonObject) {

        //Iterate through all key-value pairs
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {

            String key = entry.getKey();
            JsonElement value = entry.getValue();

            //Printing key and value
            System.out.println(key + " : " + value);
        }
    }
}
