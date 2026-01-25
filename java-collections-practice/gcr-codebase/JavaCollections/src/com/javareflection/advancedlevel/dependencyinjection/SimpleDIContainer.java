package com.javareflection.advancedlevel.dependencyinjection;
import java.lang.reflect.Field;

public class SimpleDIContainer {

    //Createing object and injects dependencies
    public static <T> T getObject(Class<T> clazz) {

        try {
            //Creating object of given class
            T obj = clazz.getDeclaredConstructor().newInstance();

            //Scan all fields
            for (Field field : clazz.getDeclaredFields()) {

                //Check if field has @Inject
                if (field.isAnnotationPresent(Inject.class)) {

                    //Creating dependency object
                    Object dependency =
                        field.getType().getDeclaredConstructor().newInstance();

                    //Allowing access to private field
                    field.setAccessible(true);

                    //Inject dependency
                    field.set(obj, dependency);
                }
            }
            return obj;

        } 
        catch (Exception e) {
            throw new RuntimeException("Dependency injection failed", e);
        }
    }
}