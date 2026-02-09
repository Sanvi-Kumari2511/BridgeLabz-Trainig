package com.multithreading.threadwithconstructorparameters;

class GreetingThread extends Thread {
    private String message;
    private int count;
    
    public GreetingThread(String message, int count) {
      this.message = message;
      this.count = count;
      }
    @Override
    public void run() {
      for (int i = 1; i <= count; i++) {
         System.out.println(message + " - Iteration: " + i);
         try {
             Thread.sleep(300);
         } 
         catch (InterruptedException e) {
            e.printStackTrace();
          }
       }
    }
}