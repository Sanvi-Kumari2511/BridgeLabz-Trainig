package com.loanbuddy;

public class HomeLoan extends LoanApplication {

	    //Constructor for home loan
	    public HomeLoan(Applicant applicant, int term) {
	        super(applicant, term, 8.5);
	    }

	    //Approval rules for home loan (Override)
	    public boolean approveLoan() {

	        boolean status = applicant.getCreditScore() >= 700 &&
	                         applicant.getIncome() >= 50000;

	        setApproved(status);
	        return status;
	    }

	    //Lowest EMI due to lower interest(Override)
	    public double calculateEMI() {
	        return calculateStandardEMI(0.0);
	    }
	}
