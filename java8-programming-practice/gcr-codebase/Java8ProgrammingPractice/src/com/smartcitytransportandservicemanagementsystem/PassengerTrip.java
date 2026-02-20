package com.smartcitytransportandservicemanagementsystem;

// Passenger trip data class
public class PassengerTrip {

    private String route;
    private double fare;
    private boolean peakTime;

    public PassengerTrip(String route, double fare, boolean peakTime) {
        this.route = route;
        this.fare = fare;
        this.peakTime = peakTime;
    }

    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public boolean isPeakTime() { return peakTime; }
}