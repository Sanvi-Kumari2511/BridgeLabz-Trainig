package com.javareflection.basiclevel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInformation {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fully qualified class name: ");
        String className = sc.nextLine();

        try {
            //Load class dynamically
            Class<?> clazz = Class.forName(className);

            System.out.println("\nClass Name: " + clazz.getName());

            //Displaying constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            //Displaying fields
            System.out.println("\nFields:");
            Field[] fields = clazz.getDeclaredFields();
            
            for (Field field : fields) {
                System.out.println(field);
            }

            //Displaying methods
            System.out.println("\nMethods:");
            Method[] methods = clazz.getDeclaredMethods();
            
            for (Method method : methods) {
                System.out.println(method);
            }

        } 
        catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
