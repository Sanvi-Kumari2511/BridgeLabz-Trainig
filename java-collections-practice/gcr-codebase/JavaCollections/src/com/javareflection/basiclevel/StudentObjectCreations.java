package com.javareflection.basiclevel;

public class StudentObjectCreations {
	public static void main(String[] args) {

        try {
            //Load class dynamically
            Class<?> clazz = Class.forName("com.javareflection.basiclevel.Student");

            //Create object withoutT using new keyword
            Object obj = clazz.getDeclaredConstructor().newInstance();

            //Casting object
            Student student = (Student) obj;

            //Calling method
            student.display();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
