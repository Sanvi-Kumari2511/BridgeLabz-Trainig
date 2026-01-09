package com.algorithmruntimeanalysis;

public class RecursiveVsIterativeFibonacci {

	    //Recursive Fibonacci
	    public static int fibonacciRecursive(int number) {
	        if (number <= 1)
	            return number;
	        return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
	    }

	    //Iterative Fibonacci
	    public static int fibonacciIterative(int number) {
	        if (number <= 1)
	            return number;

	        int a = 0, b = 1, sum = 0;
	        for (int i = 2; i <= number; i++) {
	            sum = a + b;
	            a = b;
	            b = sum;
	        }
	        
	        return b;
	    }

	    public static void main(String[] args) {

	        int number = 30; 
	        long start, end;

	        //Recursive method timing
	        start = System.nanoTime();
	        
	        fibonacciRecursive(number);
	        
	        end = System.nanoTime();
	        
	        System.out.println("Recursive Time: " + (end - start) / 1000000.0 + " ms");

	        //Iterative method timing
	        start = System.nanoTime();
	        
	        fibonacciIterative(number);
	        
	        end = System.nanoTime();
	        
	        System.out.println("Iterative Time: " + (end - start) / 1000000.0 + " ms");
	    }
	}

