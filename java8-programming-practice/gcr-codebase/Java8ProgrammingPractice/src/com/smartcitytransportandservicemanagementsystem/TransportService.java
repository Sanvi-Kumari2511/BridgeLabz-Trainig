package com.smartcitytransportandservicemanagementsystem;

// Interface for all transport services
public interface TransportService {

    String getServiceName();
    double getFare();
    String getRoute();
    int getDepartureTime();

    // Default method
    default void printServiceDetails() {
        System.out.println("Service: " + getServiceName()
                + " | Route: " + getRoute()
                + " | Fare: " + getFare()
                + " | Departure: " + getDepartureTime());
    }
}