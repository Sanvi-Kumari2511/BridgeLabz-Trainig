package com.javaannotations.intermediatelevellevel.loggingmethod;
import java.lang.reflect.Method;

public class ExecutionTimeLogger {

    public static void main(String[] args) {

        try {
        	//Loading the class dynamically 
            Class<?> clazz = Class.forName("com.javaannotations.intermediatelevellevel.loggingmethod.SampleTasks");

            Object obj = clazz.getDeclaredConstructor().newInstance();

            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {

            	 //Check if the method has the @LogExecutionTime annotation
                if (method.isAnnotationPresent(LogExecutionTime.class)) {
                    System.out.println("Executing method: " + method.getName());

                    //Start time in nanoseconds
                    long start = System.nanoTime();   
                    
                    //Access the method dynamically
                    method.invoke(obj);                 
                    long end = System.nanoTime();      

                    //End time in nanoseconds
                    long duration = end - start;
                    System.out.println("Execution time (ns): " + duration);
                    System.out.println("--------------------------");
                }
            }

        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}