package com.encapsulation;
import java.util.ArrayList;
import java.util.List;

public class BankingSystem {

	    public static void main(String[] args) {

	        List<BankAccount> accounts = new ArrayList<>();

	        BankAccount ac1 = new SavingsAccount("SB93674", "Sanvi", 100000);
	        BankAccount ac2 = new CurrentAccount("CA93784", "Riya", 80000);

	        accounts.add(ac1);
	        accounts.add(ac2);

	        for (BankAccount account : accounts) {

	            System.out.println("Account Holder name: " + account.getHolderName());
	            System.out.println("Account Number: " + account.getAccountNumber());
	            System.out.println("Balance: " + account.getBalance());

	            double interest = account.calculateInterest();
	            System.out.println("Interest got: " + interest);

	            if (account instanceof Loanable) {
	                Loanable loanAccount = (Loanable) account;
	                System.out.println("Loan Eligibility: " + loanAccount.calculateLoanEligibility());
	            }

	            System.out.println("----------------------------");
	        }
	    }
	}


