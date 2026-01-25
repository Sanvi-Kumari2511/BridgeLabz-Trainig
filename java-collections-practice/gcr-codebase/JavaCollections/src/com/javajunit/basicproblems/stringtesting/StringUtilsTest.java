package com.javajunit.basicproblems.stringtesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
	StringUtils utility = new StringUtils();

    //Test reverse()
    @Test
    void testReverse() {
        assertEquals("avaJ", utility.reverse("Java"));
    }

    //Test palindrome
    @Test
    void testIsPalindromeTrue() {
        assertTrue(utility.isPalindrome("madam"));
    }

    //Test palindrome 
    @Test
    void testIsPalindromeFalse() {
        assertFalse(utility.isPalindrome("hello"));
    }

    //Test toUpperCase()
    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utility.toUpperCase("hello"));
    }

    //Test null input
    @Test
    void testNullInput() {
        assertNull(utility.reverse(null));
        assertFalse(utility.isPalindrome(null));
        assertNull(utility.toUpperCase(null));
    }
}
