package com.javaannotations.begginerlevel.todoannotation;
public class ProjectTasks {

    @Todo(task = "Implement login feature", assignedTo = "Sanvi", priority = "HIGH")
    public void login() {
        System.out.println("Login functionality not implemented yet");
    }

    @Todo(task = "Add password recovery", assignedTo = "Shivani")
    public void recoverPassword() {
        System.out.println("Password recovery pending");
    }

    @Todo(task = "Implement reporting module", assignedTo = "Priyanshu", priority = "HIGH")
    public void generateReport() {
        System.out.println("Report generation pending");
    }

    public void completedFeature() {
        System.out.println("This feature is done!");
    }
}