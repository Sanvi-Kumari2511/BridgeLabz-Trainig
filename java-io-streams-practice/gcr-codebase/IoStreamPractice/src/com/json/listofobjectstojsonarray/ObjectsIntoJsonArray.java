package com.json.listofobjectstojsonarray;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

public class ObjectsIntoJsonArray {
	public static void main(String[] args) {

        //Creating a list to store Student objects
        List<Student> students = new ArrayList<>();

        //Adding sample data
        students.add(new Student("Sanvi", 21, "sanvi@gmail.com"));
        students.add(new Student("Sandip", 26, "sandip@gmail.com"));
        students.add(new Student("Shivani", 24, "shivani@gmail.com"));

        //Creating Gson instance with pretty printing
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        //Converting list into JSON array
        String jsonArray = gson.toJson(students);

        //Displaying output
        System.out.println(jsonArray);
    }
}
