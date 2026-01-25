package com.javaannotations.intermediatelevellevel.loggingmethod;
public class SampleTasks {

    @LogExecutionTime
    public void task1() {
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        System.out.println("Task1 sum: " + sum);
    }

    @LogExecutionTime
    public void task2() {
        try {
            Thread.sleep(500);  
        } 
        
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task2 done sleeping");
    }

    public void normalTask() {
        System.out.println("Normal task executed");
    }
}