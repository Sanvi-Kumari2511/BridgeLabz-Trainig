package com.streamapi.insuranceclaimanalysis;

class Claim {
    String claimType;
    double amount;

    //Constructor to initialize claim details
    Claim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }

    //Method to get claim type
    public String getClaimType() {
        return claimType;
    }

    //Method to get amount
    public double getAmount() {
        return amount;
    }
}
