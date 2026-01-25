package com.javajunit.basicproblems.calculatortesting;

public class Calculator {
    public int add(int a, int b) {
    	return a + b ;
    }
    
    public int subtract(int a, int b) {
    	return a - b;
    }
    
    public int multiply(int a, int  b) {
    	return a * b;
    }
    
    public int divide(int a, int b) {
         if(b == 0) {
        	 throw new ArithmeticException("Any number cannot be divisible by zero");
         }
         
         return a / b;
    }
}
