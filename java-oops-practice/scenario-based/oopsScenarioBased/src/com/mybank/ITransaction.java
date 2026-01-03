package com.mybank;

public interface ITransaction {
   void deposit(double balance);
   void withdraw(double balance);
   double checkBalance();
}
