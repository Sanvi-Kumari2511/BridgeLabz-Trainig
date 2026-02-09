package com.multithreading.threadwithconstructorparameters;

public class ThreadExample2 {
   public static void main(String[] args) {
      GreetingThread hello = new GreetingThread("Hello", 3);
      GreetingThread welcome = new GreetingThread("Welcome", 3);
      hello.start();
      welcome.start();
      }
}