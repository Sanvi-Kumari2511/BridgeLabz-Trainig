package com.multithreading.threadusingrunnableinterface;

class PrintTask implements Runnable {
    private String taskName;
    
    public PrintTask(String taskName) {
    this.taskName = taskName;
    }
    @Override
    public void run() {
       for (int i = 1; i <= 5; i++) {
          System.out.println(taskName + " - Count: " + i + " [" + Thread.currentThread().getName() + "]");

          try {
              Thread.sleep(400);
          } 
          catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
      System.out.println(taskName + " completed!");
   }
}