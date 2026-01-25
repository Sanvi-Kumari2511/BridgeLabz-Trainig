package com.javareflection.basiclevel;

import java.lang.reflect.Field;

public class PersonAccessField {
	public static void main(String[] args) {

        try {
            //Creating object of Person class
            Person person = new Person();

            //Get Class object
            Class<?> clazz = person.getClass();

            //Access private field "age"
            Field ageField = clazz.getDeclaredField("age");

            //Make private field accessible
            ageField.setAccessible(true);

            //Modify private field value
            ageField.set(person, 21);

            //Retrieve private field value
            int ageValue = (int) ageField.get(person);

            System.out.println("Age using Reflection: " + ageValue);

        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
