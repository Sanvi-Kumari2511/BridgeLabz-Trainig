package com.javaannotations.exercise5;
import java.lang.reflect.Method;

public class BugReportReader {

    public static void main(String[] args) {

        try {
            Class<?> clazz =
                Class.forName("com.javaannotations.exercise5.Software");

            Method method = clazz.getDeclaredMethod("runApplication");

            //Retrieve all BugReport annotations
            BugReport[] reports =
                method.getAnnotationsByType(BugReport.class);

            for (BugReport report : reports) {
                System.out.println("Bug: " + report.description());
            }

        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}