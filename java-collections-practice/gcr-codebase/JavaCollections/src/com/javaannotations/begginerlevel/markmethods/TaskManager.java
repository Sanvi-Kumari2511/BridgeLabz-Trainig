package com.javaannotations.begginerlevel.markmethods;
public class TaskManager {

    @ImportantMethod
    public void deployApplication() {
        System.out.println("Deploying application");
    }

    @ImportantMethod(level = "MEDIUM")
    public void runTests() {
        System.out.println("Running tests");
    }

    public void logActivity() {
        System.out.println("Logging activity");
    }
}