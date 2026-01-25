package com.javajunit.basicproblems.exceptionhandlingtesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator calculator = new Calculator();

    //Exception test while dividing by zero
    @Test
    void testDivideByZeroException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    //Test valid division
    @Test
    void testDivideSuccess() {
        assertEquals(5, calculator.divide(10, 2));
    }
}
