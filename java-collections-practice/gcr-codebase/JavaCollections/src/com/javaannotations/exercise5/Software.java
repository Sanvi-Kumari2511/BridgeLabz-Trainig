package com.javaannotations.exercise5;
public class Software {

    @BugReport(description = "NullPointerException on startup")
    @BugReport(description = "Memory leak while data loading")
    public void runApplication() {
        System.out.println("Application is running");
    }
}