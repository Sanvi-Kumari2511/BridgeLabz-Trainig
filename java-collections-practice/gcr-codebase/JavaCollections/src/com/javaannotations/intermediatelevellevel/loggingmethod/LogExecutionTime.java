package com.javaannotations.intermediatelevellevel.loggingmethod;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

//Retention at runtime to access via reflection
@Retention(RetentionPolicy.RUNTIME)
// Can be applied to methods only
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
}