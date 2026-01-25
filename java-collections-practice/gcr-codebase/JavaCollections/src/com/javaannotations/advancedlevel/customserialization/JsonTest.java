package com.javaannotations.advancedlevel.customserialization;
public class JsonTest {

    public static void main(String[] args) {

        User user = new User("Sanvi", 21, "sanvi@gmail.com");

        //Convert object to JSON
        String jsonOutput = Json.toJson(user);

        System.out.println(jsonOutput);
    }
}