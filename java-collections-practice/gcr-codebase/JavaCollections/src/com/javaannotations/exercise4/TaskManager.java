package com.javaannotations.exercise4;
public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Sanvi")
    public void completeTask() {
        System.out.println("Task completed");
    }
}