package com.javaannotations.advancedlevel.customserialization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// \Annotation available at runtime
@Retention(RetentionPolicy.RUNTIME)

//Applied only to fields
@Target(ElementType.FIELD)
public @interface JsonField {
    String name(); 
}