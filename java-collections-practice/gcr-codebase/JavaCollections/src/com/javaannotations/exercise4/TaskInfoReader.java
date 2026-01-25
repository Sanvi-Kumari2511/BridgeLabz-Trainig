package com.javaannotations.exercise4;
import java.lang.reflect.Method;

public class TaskInfoReader {

    public static void main(String[] args) {

        try {
            //Load TaskManager class
            Class<?> clazz =
                Class.forName("com.javaannotations.exercise4.TaskManager");

            //Get all methods
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {

                //Check if TaskInfo annotation is present
                if (method.isAnnotationPresent(TaskInfo.class)) {

                    //Retrieve annotation
                    TaskInfo info = method.getAnnotation(TaskInfo.class);

                    //Displaying annotation details
                    System.out.println("Method: " + method.getName());
                    System.out.println("Priority: " + info.priority());
                    System.out.println("Assigned To: " + info.assignedTo());
                }
            }

        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}