package com.encapsulation;

class SavingsAccount extends BankAccount implements Loanable {
	private static final double interestRate = 0.05; 

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    //Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    //Override
    public void applyForLoan(double amount) {
        System.out.println("Applied loan for amount: " + amount);
    }

    //Override
    public double calculateLoanEligibility() {
        return balance * 10; 
    }
}
