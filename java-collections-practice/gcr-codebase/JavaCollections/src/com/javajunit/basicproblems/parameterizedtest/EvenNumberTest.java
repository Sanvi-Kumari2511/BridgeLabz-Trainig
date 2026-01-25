package com.javajunit.basicproblems.parameterizedtest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenNumberTest {
	
	//Parameterized test with multiple values
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    
    void testIsEven(int number) {

        if (number % 2 == 0) {
            assertTrue(EvenNumber.isEven(number));
        } 
        
        else {
            assertFalse(EvenNumber.isEven(number));
        }
    }
}
