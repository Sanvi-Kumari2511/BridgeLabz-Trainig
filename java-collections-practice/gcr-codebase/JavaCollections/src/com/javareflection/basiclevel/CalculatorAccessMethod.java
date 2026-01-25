package com.javareflection.basiclevel;

import java.lang.reflect.Method;

public class CalculatorAccessMethod {
	public static void main(String[] args) {

        try {
        
            //Creating object of Calculator
            Calculator calculator = new Calculator();

            //Get Class object
            Class<?> clazz = calculator.getClass();

            //Get private method multiply
            Method method = clazz.getDeclaredMethod("multiply", int.class, int.class);

            //Make private method accessible
            method.setAccessible(true);

            //Access private method
            Object result = method.invoke(calculator, 3, 5);

            System.out.println("Result using Reflection: " + result);

        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}