package com.loanbuddy;

//Personal Loan implementation
class PersonalLoan extends LoanApplication {

 //Default constructor for personal loan
 public PersonalLoan(Applicant applicant) {
     super(applicant, 36, 12.5);
 }

 //Approval rules for personal loan (override)
 public boolean approveLoan() {

     boolean status = applicant.getCreditScore() >= 650 &&
                      applicant.getIncome() >= 25000;

     setApproved(status);
     return status;
 }

 //EMI calculation with higher risk rate (Override)
 public double calculateEMI() {
     return calculateStandardEMI(0.01);
 }
}
