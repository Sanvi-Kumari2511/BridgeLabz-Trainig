package com.javaannotations.exercise2;
public class DeprecatedTest {

    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        //Show a warning in IDE
        api.oldFeature();

        //This is the recommended method
        api.newFeature();
    }
}