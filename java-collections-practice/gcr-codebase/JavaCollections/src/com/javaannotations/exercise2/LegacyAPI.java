package com.javaannotations.exercise2;
public class LegacyAPI {

    //Old method that should not be used
    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature is deprecated");
    }

    //New recommended method
    public void newFeature() {
        System.out.println("New feature is recommended");
    }
}
