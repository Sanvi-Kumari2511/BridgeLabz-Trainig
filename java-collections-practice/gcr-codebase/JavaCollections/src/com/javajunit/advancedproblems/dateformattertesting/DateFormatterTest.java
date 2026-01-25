package com.javajunit.advancedproblems.dateformattertesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {
	
	//Test valid date formatting
    @Test
    void testValidDate() {
        assertEquals("25-12-2024",
                DateFormatter.formatDate("2024-12-25"));
    }

    //Test invalid date format
    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("25-12-2024");
        });
    }

    // Test invalid date value
    @Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("2024-13-40");
        });
    }
}
