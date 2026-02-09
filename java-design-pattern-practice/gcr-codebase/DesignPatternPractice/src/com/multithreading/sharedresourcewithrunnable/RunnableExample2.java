package com.multithreading.sharedresourcewithrunnable;

public class RunnableExample2 {
    public static void main(String[] args) {
       BankAccount account = new BankAccount();

       Thread t1 = new Thread(new WithdrawTask(account, 600), "Customer-1");

       Thread t2 = new Thread(new WithdrawTask(account, 600), "Customer-2");
       
       t1.start();
       t2.start();
    }
}