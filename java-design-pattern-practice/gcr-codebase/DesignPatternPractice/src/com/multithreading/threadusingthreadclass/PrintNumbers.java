package com.multithreading.threadusingthreadclass;

class PrintNumbers extends Thread {
    @Override
    public void run() {
       for (int i = 1; i <= 5; i++) {
          System.out.println(Thread.currentThread().getName() + ": " + i);

          try {
              Thread.sleep(500); // Pause for 500 milliseconds
          } 
          catch (InterruptedException e) {
             System.out.println(e);
          }
       }
    }
}