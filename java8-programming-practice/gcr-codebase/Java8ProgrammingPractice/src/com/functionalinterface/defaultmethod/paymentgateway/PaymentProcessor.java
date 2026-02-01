package com.functionalinterface.defaultmethod.paymentgateway;

@FunctionalInterface
public interface PaymentProcessor {

   void pay(int amount);
   
   //Default method 
   default void refund(int amount) {
	   System.out.println("Refund processed: " + amount);
   }
}
