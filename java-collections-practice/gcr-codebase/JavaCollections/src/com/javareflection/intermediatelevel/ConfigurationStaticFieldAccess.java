package com.javareflection.intermediatelevel;

import java.lang.reflect.Field;

public class ConfigurationStaticFieldAccess {
	public static void main(String[] args) {

        try {
            //Load Configuration class
            Class<?> clazz = Class.forName("com.javareflection.intermediatelevel.Configuration");

            //Access private static field
            Field field = clazz.getDeclaredField("API_KEY");

          //Printing value before modify
            System.out.println("Before Modification:");
            Configuration.showKey();
            
            System.out.println("------------------------------");
            
            //Make private field accessible
            field.setAccessible(true);

            //Modify static field (pass null for static)
            field.set(null, "NEW_SECURE_API_KEY");

            //Printing value after modify
            System.out.println("After Modification:");
            Configuration.showKey();

        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
