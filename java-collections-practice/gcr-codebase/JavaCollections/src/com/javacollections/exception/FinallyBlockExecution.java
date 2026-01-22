package com.javacollections.exception;

import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String args []) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		
    		System.out.print("Enter first number: ");
    		int number1 = sc.nextInt();
    		
    		System.out.print("Enter second number: ");
    		int number2 = sc.nextInt();
    		
    		int result = number1 / number2;
    		System.out.print("Result: " + result);
    	}
    	
    	catch(ArithmeticException e) {
    		System.out.print("Any number is not dividible by zero");
    		
    	}
    	
    	finally {
    		System.out.print("\nOperation completed");
    	}
    }
}
