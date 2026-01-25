package com.javajunit.basicproblems.performancetesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PerformanceTest {
	//Method to check test will paas or fail
    @Test
    @Timeout(2)
    
    void testLongRunningTaskTimeout() throws InterruptedException {
        Performance.longRunningTask();
    }
}
