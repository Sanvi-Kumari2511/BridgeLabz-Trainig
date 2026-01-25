package com.javaannotations.intermediatelevellevel.maxlength;
import java.lang.reflect.Field;

public class User {

    //MaxLength annotation to username field
    @MaxLength(10)
    private String username;

    //Constructor
    public User(String username) {
        this.username = username;

        //Validate the field length using reflection
        try {
        	
            Field field = this.getClass().getDeclaredField("username");

            //Check if field has @MaxLength annotation
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);

                if (username.length() > maxLength.value()) {
                    //Throw exception if exceeded
                    throw new IllegalArgumentException("Username cannot exceed " + maxLength.value() + " characters."
                    );
                }
            }

        } 
        
        catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}