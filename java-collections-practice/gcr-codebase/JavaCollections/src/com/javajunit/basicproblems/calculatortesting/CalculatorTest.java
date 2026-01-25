package com.javajunit.basicproblems.calculatortesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	Calculator calculator = new Calculator();
	
	@Test
	void testAdd() {
		assertEquals(10, calculator.add(5, 5));
	}
	
	@Test
	void testSubtract() {
		assertEquals(2, calculator.subtract(5, 3));
	}
	
	@Test
	void testMultiply() {
		assertEquals(15, calculator.multiply(5, 3));
	}
	
	@Test
	void testDivide() {
		assertEquals(2, calculator.divide(10, 5));
	}
	
	@Test
	void testDivideByZero() {
		Exception exception = assertThrows(
				ArithmeticException.class, 
				() -> calculator.divide(10, 0)
				);
		
		assertEquals("Any number cannot be divisible by zero", exception.getMessage());
	}
   
}
