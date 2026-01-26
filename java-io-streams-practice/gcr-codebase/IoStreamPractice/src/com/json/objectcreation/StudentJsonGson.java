package com.json.objectcreation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;

public class StudentJsonGson {
    public static void main(String[] args) {

    	 //Enable pretty printing 
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        //Creating JSON object
        JsonObject student = new JsonObject();

        //Adding simple properties
        student.addProperty("Name", "Sanvi");
        student.addProperty("Age", 21);

        //Creating JSON array for subjects
        JsonArray subjects = new JsonArray();
        subjects.add("Maths");
        subjects.add("Physics");
        subjects.add("Computer Science");

        //Adding array to JSON object
        student.add("Subjects", subjects);

        //Converting JSON object to String
        String jsonOutput = gson.toJson(student);

        //Printing JSON
        System.out.println(jsonOutput);
    }
}