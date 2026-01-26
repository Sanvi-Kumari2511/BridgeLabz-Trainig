package com.json.conversiontojsonarray;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

public class ObjectsIntoJsonArray {
	public static void main(String[] args) {

        //Creating list to store Student objects
        List<Student> students = new ArrayList<>();

        //Adding sample data to the list
        students.add(new Student("Sanvi", 21, "sanvi@gmail.com"));
        students.add(new Student("Sandip", 22, "sandip@gmail.com"));
        students.add(new Student("Priyanshu", 23, "priyanshu@gmail.com"));

        //Creating Gson instance with pretty printing
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        //Converting list of objects into JSON array
        String jsonArray = gson.toJson(students);

        //Displaying output
        System.out.println(jsonArray);
    }
}
