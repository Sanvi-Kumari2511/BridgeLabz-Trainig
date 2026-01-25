package com.javareflection.intermediatelevel;


import java.lang.reflect.Method;
import java.util.Scanner;

public class MathOperationDynamicMethod {
	public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            //Taking method name from user
            System.out.print("Enter method name (add / subtract / multiply): ");
            String methodName = sc.nextLine();

            //Taking numbers from user
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            //Load the class dynamically
            Class<?> clazz = Class.forName("com.javareflection.intermediatelevel.MathOperations");

            //Creating object dynamically
            Object obj = clazz.getDeclaredConstructor().newInstance();

            //Get method dynamically 
            Method method = clazz.getMethod(methodName, int.class, int.class);

            //Access method dynamically
            Object result = method.invoke(obj, a, b);

            //Displaying outputs
            System.out.println("Result: " + result);

        } 
        
        catch (NoSuchMethodException e) {
            System.out.println("Invalid method name!");
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
