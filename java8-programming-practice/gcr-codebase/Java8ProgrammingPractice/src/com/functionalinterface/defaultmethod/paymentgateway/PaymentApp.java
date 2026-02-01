package com.functionalinterface.defaultmethod.paymentgateway;

public class PaymentApp {
	public static void main(String[] args) {
	    //UPI payment using lamda
		PaymentProcessor upi = (amount) -> {
			System.out.println("Paid " + amount + " using UPI");
		};
		
		upi.pay(2000);
		upi.refund(1000);
		
		System.out.println();
		
		//Card payment using lamda
		PaymentProcessor card = (amount) -> {
			System.out.println("Paid " + amount + " using Card");
		};
		
		card.pay(3000);
		card.refund(1500);
	}
}
