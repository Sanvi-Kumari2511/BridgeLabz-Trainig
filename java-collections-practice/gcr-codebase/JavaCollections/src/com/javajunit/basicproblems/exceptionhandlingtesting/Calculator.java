package com.javajunit.basicproblems.exceptionhandlingtesting;

public class Calculator {
	public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
