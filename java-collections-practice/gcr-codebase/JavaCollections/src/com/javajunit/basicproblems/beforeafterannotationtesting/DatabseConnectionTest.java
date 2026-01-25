package com.javajunit.basicproblems.beforeafterannotationtesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class DatabseConnectionTest {
	DatabaseConnection db;

    //Runs before test method
    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    //Runs after test method
    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    //Verify database connection is connected or not
    @Test
    void testDatabaseConnection() {
        assertTrue(db.isConnected());
    }

    //Verify connection is closed after test
    @Test
    void testDatabaseDisconnection() {
        assertTrue(db.isConnected());
    }
}
