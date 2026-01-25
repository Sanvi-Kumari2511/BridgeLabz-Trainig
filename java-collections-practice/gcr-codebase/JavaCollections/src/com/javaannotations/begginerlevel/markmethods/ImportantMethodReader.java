package com.javaannotations.begginerlevel.markmethods;
import java.lang.reflect.Method;

public class ImportantMethodReader {

    public static void main(String[] args) {

        try {
            Class<?> clazz = Class.forName("com.javaannotations.begginerlevel.markmethods.TaskManager");

            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {

                //Check if method is annotated with @ImportantMethod
                if (method.isAnnotationPresent(ImportantMethod.class)) {

                    ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);

                    System.out.println("Method: " + method.getName() 
                        + ", Level: " + annotation.level());
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}