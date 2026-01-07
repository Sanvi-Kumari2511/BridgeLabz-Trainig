package com.loanbuddy;

 class AutoLoan extends LoanApplication{

	     //Constructor for auto loan
	     public AutoLoan(Applicant applicant, int term) {
	         super(applicant, term, 10.0);
	     }

	     //Approval rules for auto loan (Override)
	     public boolean approveLoan() {

	         boolean status = applicant.getCreditScore() >= 680;
	         setApproved(status);
	         return status;
	     }

	     //EMI with moderate interest (Override)
	     public double calculateEMI() {
	         return calculateStandardEMI(0.005);
	     }
	 }
