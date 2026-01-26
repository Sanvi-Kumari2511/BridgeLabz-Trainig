package com.json.conversion;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjectToJSONFormat {

    public static void main(String[] args) {

        //Create Car object
        Car car = new Car("Toyota", "Camry", 2022);

        //Convert object to JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(car);

        //Displaying output
        System.out.println(json);
    }
}