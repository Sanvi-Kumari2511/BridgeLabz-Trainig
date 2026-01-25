package com.javaannotations.begginerlevel.todoannotation;
import java.lang.reflect.Method;

public class TodoReader {

    public static void main(String[] args) {

        try {
            //Load class
            Class<?> clazz = Class.forName("com.javaannotations.begginerlevel.todoannotation.ProjectTasks");

            Method[] methods = clazz.getDeclaredMethods();

            System.out.println("Pending Tasks:");

            for (Method method : methods) {
                //Check if method has @Todo
                if (method.isAnnotationPresent(Todo.class)) {

                    Todo todo = method.getAnnotation(Todo.class);

                    System.out.println("Method: " + method.getName());
                    System.out.println("Task: " + todo.task());
                    System.out.println("Assigned To: " + todo.assignedTo());
                    System.out.println("Priority: " + todo.priority());
                    System.out.println("---------------------------");
                }
            }

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}