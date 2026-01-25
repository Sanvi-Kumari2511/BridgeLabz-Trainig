package com.javajunit.advancedproblems.passwordstrengthtesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
	//Valid password test
    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("StrongPass1"));
    }

    //Check less than 8 characters
    @Test
    void testTooShortPassword() {
        assertFalse(PasswordValidator.isValid("Ab1"));
    }

    //Check no uppercase letter
    @Test
    void testNoUppercaseLetter() {
        assertFalse(PasswordValidator.isValid("password1"));
    }

    //Check no digit
    @Test
    void testNoDigit() {
        assertFalse(PasswordValidator.isValid("Password"));
    }

    //Check null password
    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null));
    }
}
