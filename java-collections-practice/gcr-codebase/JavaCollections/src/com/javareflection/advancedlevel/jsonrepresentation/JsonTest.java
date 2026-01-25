package com.javareflection.advancedlevel.jsonrepresentation;
public class JsonTest {

    public static void main(String[] args) {

        Person person = new Person(1, "Sanvi", true);

        String json = JsonUtil.toJson(person);

        System.out.println(json);
    }
}