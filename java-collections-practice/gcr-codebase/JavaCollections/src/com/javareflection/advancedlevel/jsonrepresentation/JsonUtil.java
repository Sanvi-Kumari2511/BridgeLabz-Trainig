package com.javareflection.advancedlevel.jsonrepresentation;
import java.lang.reflect.Field;

public class JsonUtil {

    //Converts any object to JSON-like string using reflection
    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder();
        json.append("{");

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            try {
            	
                json.append("\"")
                    .append(field.getName())
                    .append("\": ");

                Object value = field.get(obj);

                //Adding quotes for String values
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } 
            
            catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }
}