package com.multithreading.threadusingthreadclass;

public class ThreadExample1 {
    public static void main(String[] args) {
        PrintNumbers t1 = new PrintNumbers();
        PrintNumbers t2 = new PrintNumbers();
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t1.start();
        t2.start();
    }
}