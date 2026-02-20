package com.smartcitytransportandservicemanagementsystem;

// Taxi implementation
public class TaxiService implements TransportService {

	private String route;
	private double fare;
	private int departureTime;

	public TaxiService(String route, double fare, int departureTime) {
		this.route = route;
		this.fare = fare;
		this.departureTime = departureTime;
	}

	public String getServiceName() {
		return "Taxi";
	}

	public double getFare() {
		return fare;
	}

	public String getRoute() {
		return route;
	}

	public int getDepartureTime() {
		return departureTime;
	}
}