package com.smartcitytransportandservicemanagementsystem;

// Metro implementation
public class MetroService implements TransportService {

    private String route;
    private double fare;
    private int departureTime;

    public MetroService(String route, double fare, int departureTime) {
        this.route = route;
        this.fare = fare;
        this.departureTime = departureTime;
    }

    public String getServiceName() { return "Metro"; }
    public double getFare() { return fare; }
    public String getRoute() { return route; }
    public int getDepartureTime() { return departureTime; }
}