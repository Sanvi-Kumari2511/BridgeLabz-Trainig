package com.functionalinterface.digitalpaymentinterface;

@FunctionalInterface
public interface PaymentAction {
  void pay(double amount);
}
