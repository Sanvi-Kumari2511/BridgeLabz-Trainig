package com.encapsulation;

class CurrentAccount extends BankAccount{
	private static final double interestRate = 0.06; 

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    //Override
    public double calculateInterest() {
        return balance * interestRate;
    }

}
