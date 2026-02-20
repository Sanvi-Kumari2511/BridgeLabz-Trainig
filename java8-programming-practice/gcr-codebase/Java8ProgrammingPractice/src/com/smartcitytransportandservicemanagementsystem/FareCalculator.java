package com.smartcitytransportandservicemanagementsystem;

// Functional interface
@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double base, double distance);
}