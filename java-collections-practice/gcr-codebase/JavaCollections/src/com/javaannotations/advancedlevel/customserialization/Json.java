package com.javaannotations.advancedlevel.customserialization;

import java.lang.reflect.Field;

public class Json {

    //Converts an object to JSON string 
    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder();
        json.append("{");

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        boolean firstField = true;

        for (Field field : fields) {

            //Process only fields annotated with @JsonField
            if (field.isAnnotationPresent(JsonField.class)) {

                JsonField annotation = field.getAnnotation(JsonField.class);
                String jsonKey = annotation.name();

                field.setAccessible(true);

                try {
                    Object value = field.get(obj);

                    if (!firstField) {
                        json.append(", ");
                    }

                    json.append("\"").append(jsonKey).append("\": ");

                    //Adding quotes only for String values
                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    }
                    
                    else {
                        json.append(value);
                    }

                    firstField = false;

                } 
                
                catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        json.append("}");
        return json.toString();
    }
}