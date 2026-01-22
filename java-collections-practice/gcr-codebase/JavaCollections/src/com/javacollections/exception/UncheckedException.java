package com.javacollections.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
     public static void main(String args []) {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 try {
    		 
    		 System.out.println("Enter first number:");
    		 int number1 = sc.nextInt();
    		 
    		 System.out.println("Enter second number:");
    		 int number2 = sc.nextInt();
    		 
    		 int result = number1 / number2;
    		 System.out.println("Result: " + result);
   
    	 }
    	 
    	 catch(ArithmeticException e) {
    		 System.out.println("Any number is not divisible by zero");
    		 
    	 }
    	 
    	 catch(InputMismatchException e) {
    		 System.out.println("Please enter a valid number");
    	 }
    	 
    	 finally {
    		 sc.close();
    	 }
     }
}
