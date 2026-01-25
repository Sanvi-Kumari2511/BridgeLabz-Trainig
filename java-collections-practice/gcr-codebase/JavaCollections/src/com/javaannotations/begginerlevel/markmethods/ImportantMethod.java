package com.javaannotations.begginerlevel.markmethods;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

//Annotation available at runtime
@Retention(RetentionPolicy.RUNTIME)
// Can be applied to methods only
@Target(ElementType.METHOD)
public @interface ImportantMethod {
	
    //Optional parameter with default value
    String level() default "HIGH";
}