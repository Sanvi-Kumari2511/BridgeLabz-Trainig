package com.loanbuddy;

class Applicant {

 //Private variables for encapsulation
 private String name;
 private int creditScore;
 private double income;
 private double loanAmount;

 //Constructor to initialize applicant details
 public Applicant(String name, int creditScore, double income, double loanAmount) {
     this.name = name;
     this.creditScore = creditScore;
     this.income = income;
     this.loanAmount = loanAmount;
 }

 //Getter methods (no setters for security)
 public String getName() {
     return name;
 }

 public int getCreditScore() {
     return creditScore;
 }

 public double getIncome() {
     return income;
 }

 public double getLoanAmount() {
     return loanAmount;
 }
}
