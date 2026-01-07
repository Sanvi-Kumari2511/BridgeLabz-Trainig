package com.loanbuddy;

abstract class LoanApplication implements IApprovable {

 protected Applicant applicant;   
 protected int term;              
 protected double interestRate; 

 //Loan approval status (restricted access)
 private boolean approved;

 //Constructor used by child classes
 public LoanApplication(Applicant applicant, int term, double interestRate) {
     this.applicant = applicant;
     this.term = term;
     this.interestRate = interestRate;
 }

 //Only internal classes can change approval status
 protected void setApproved(boolean status) {
     this.approved = status;
 }

 //Read-only access to approval status
 public boolean isApproved() {
     return approved;
 }

 //Common EMI calculation formula
 protected double calculateStandardEMI(double extraRate) {

     double P = applicant.getLoanAmount();         
     double R = (interestRate / 12 / 100) + extraRate; 
     int N = term;                               

     return (P * R * Math.pow(1 + R, N)) /
            (Math.pow(1 + R, N) - 1);
 }
}
