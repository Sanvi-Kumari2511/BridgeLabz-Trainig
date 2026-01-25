package com.javareflection.advancedlevel.customobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class UserCustomObjectMapper {
	//Generic method to convert Map to Object
    public static <T> T toObject(Class<T> clazz,
                                 Map<String, Object> properties) {

        try {
            //Creating object using no-arg constructor
            T obj = clazz.getDeclaredConstructor().newInstance();

            //Iterate through map entries
            for (Map.Entry<String, Object> entry : properties.entrySet()) {

                try {
                    //Get field by name
                    Field field = clazz.getDeclaredField(entry.getKey());

                    // Allow access to private fields
                    field.setAccessible(true);

                    //Set value to field
                    field.set(obj, entry.getValue());

                }
                
                catch (NoSuchFieldException e) {
              
                }
            }

            return obj;

        } 
        
        catch (Exception e) {
            throw new RuntimeException("Object mapping failed", e);
        }
    }
}
