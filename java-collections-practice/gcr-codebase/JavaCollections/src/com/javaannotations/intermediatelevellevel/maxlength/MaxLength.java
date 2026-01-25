package com.javaannotations.intermediatelevellevel.maxlength;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

//Retain at runtime to access via reflection
@Retention(RetentionPolicy.RUNTIME)
//Applied to fields only
@Target(ElementType.FIELD)
public @interface MaxLength {
    int value(); 
}