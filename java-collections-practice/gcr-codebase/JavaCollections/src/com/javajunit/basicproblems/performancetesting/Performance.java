package com.javajunit.basicproblems.performancetesting;

public class Performance {
	
	//Method to simulate long running task
    public static String longRunningTask() throws InterruptedException {
        Thread.sleep(1500); 
        
        return "Task Completed";
    }
}
