package com.multithreading.sharedresourcewithrunnable;

class BankAccount {
   private int balance = 1000;
   
   public void withdraw(int amount) {
      if (balance >= amount) {
          System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);

          try {
              Thread.sleep(100);
          } 
          catch (InterruptedException e) {
              e.printStackTrace();
          }
          balance -= amount;
          System.out.println(Thread.currentThread().getName() + " completed withdrawal. Balance: " + balance);
          } 
          else {
          System.out.println(Thread.currentThread().getName() + " - Insufficient funds!");

          }
    }
}