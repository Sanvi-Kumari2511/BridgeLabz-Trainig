package com.encapsulation;

class Truck extends Vehicle implements Insurable {

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate, policyNumber);
    }

    //Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.2; 
    }
    //Override
    public double calculateInsurance() {
        return 1000;
    }

    //Override
    public String getInsuranceDetails() {
        return "Truck Insurance | Policy: " + getPolicyNumber();
    }
}
