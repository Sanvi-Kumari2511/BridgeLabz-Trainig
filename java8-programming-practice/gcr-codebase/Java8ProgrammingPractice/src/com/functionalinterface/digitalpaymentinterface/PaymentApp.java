package com.functionalinterface.digitalpaymentinterface;

import java.util.ArrayList;
import java.util.List;

public class PaymentApp {
	public static void main(String[] args) {

        //Creating payment objects
        UPI upi = new UPI();
        CreditCard creditCard = new CreditCard();
        Wallet wallet = new Wallet();

        //Store payment actions using lambdas
        List<PaymentAction> paymentActions = new ArrayList<>();
        paymentActions.add(amount -> upi.payUPI(amount));
        paymentActions.add(amount -> creditCard.payCard(amount));
        paymentActions.add(amount -> wallet.payWallet(amount));

        //Execute payments
        double amount = 2000;
        System.out.println("Processing Payments:");
        paymentActions.forEach(action -> action.pay(amount));
    }
}
