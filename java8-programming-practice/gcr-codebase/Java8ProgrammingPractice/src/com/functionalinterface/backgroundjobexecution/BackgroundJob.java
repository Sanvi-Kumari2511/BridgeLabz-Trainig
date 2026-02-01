package com.functionalinterface.backgroundjobexecution;

public class BackgroundJob {
    public static void main(String[] args) {

    	//Print messages in background
        Runnable task1 = () -> System.out.println("Task 1 is running in the background");

        //Another background task
        Runnable task2 = () -> System.out.println("Task 2 is also running in the background");

        //Start tasks in separate threads
        new Thread(task1).start();
        new Thread(task2).start();

        //Main thread continues
        System.out.println("Main thread is running normally");
    }
}
