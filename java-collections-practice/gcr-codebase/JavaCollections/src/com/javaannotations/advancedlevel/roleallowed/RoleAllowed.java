package com.javaannotations.advancedlevel.roleallowed;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

//Annotation available at runtime
@Retention(RetentionPolicy.RUNTIME)

//Applied to methods and classes
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface RoleAllowed {
    String value(); 
}