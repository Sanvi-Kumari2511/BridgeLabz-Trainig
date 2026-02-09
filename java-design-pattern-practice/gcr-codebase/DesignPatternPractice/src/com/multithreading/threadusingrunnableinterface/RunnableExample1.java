package com.multithreading.threadusingrunnableinterface;

public class RunnableExample1 {
    public static void main(String[] args) {
    	
       PrintTask task1 = new PrintTask("Task-A");
       PrintTask task2 = new PrintTask("Task-B");
       
       Thread t1 = new Thread(task1, "Worker-1");
       Thread t2 = new Thread(task2, "Worker-2");
       
       t1.start();
       t2.start();
    }
}