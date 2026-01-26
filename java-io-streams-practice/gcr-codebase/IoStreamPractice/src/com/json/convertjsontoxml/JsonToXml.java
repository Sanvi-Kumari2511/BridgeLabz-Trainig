package com.json.convertjsontoxml;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONObject;
import org.json.XML;

import java.io.FileReader;

public class JsonToXml {
	 public static void main(String[] args) {

	        try {
	       
	            //Read JSON file using Gson
	            JsonElement jsonElement = JsonParser.parseReader(new FileReader("D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\json\\convertjsontoxml\\sample\\user.json"));

	            //Convert Gson JsonElement to String
	            String jsonString = jsonElement.toString();

	            //Convert JSON String to JSONObject
	            JSONObject jsonObject = new JSONObject(jsonString);

	            //Convert JSONObject to XML
	            String xml = XML.toString(jsonObject, "user");

	            //Adding line breaks between XML tags
	            xml = xml.replace("><", ">\n<");
	            
	            //Displaying XML output
	            System.out.println(xml);

	        } 
	        
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
