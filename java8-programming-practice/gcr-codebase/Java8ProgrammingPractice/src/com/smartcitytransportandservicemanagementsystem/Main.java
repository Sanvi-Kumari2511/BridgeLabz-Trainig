package com.smartcitytransportandservicemanagementsystem;

import java.util.*;
import java.util.stream.Collectors;

// Main class
public class Main {

	public static void main(String[] args) {

		List<TransportService> services = Arrays.asList(new BusService("A-B", 20, 900),
				new MetroService("B-C", 15, 830), new TaxiService("A-C", 50, 845), new AmbulanceService());

		services.stream().filter(s -> s.getFare() <= 50).sorted((a, b) -> a.getDepartureTime() - b.getDepartureTime())
				.forEach(TransportService::printServiceDetails);

		FareCalculator calc = (base, distance) -> base + distance * 2;
		System.out.println("Calculated Fare: " + calc.calculateFare(10, 5));

		System.out.println("Distance: " + GeoUtils.calculateDistance(0, 0, 3, 4));

		List<PassengerTrip> trips = Arrays.asList(new PassengerTrip("A-B", 20, true),
				new PassengerTrip("A-B", 25, false), new PassengerTrip("B-C", 15, true),
				new PassengerTrip("A-C", 50, false));

		Map<String, List<PassengerTrip>> grouped = trips.stream()
				.collect(Collectors.groupingBy(PassengerTrip::getRoute));

		grouped.forEach((r, t) -> System.out.println(r + " -> " + t.size()));

		Map<Boolean, List<PassengerTrip>> partition = trips.stream()
				.collect(Collectors.partitioningBy(PassengerTrip::isPeakTime));

		System.out.println("Peak: " + partition.get(true).size());
		System.out.println("Non-Peak: " + partition.get(false).size());

		DoubleSummaryStatistics stats = trips.stream().collect(Collectors.summarizingDouble(PassengerTrip::getFare));

		System.out.println("Total: " + stats.getSum());
		System.out.println("Average: " + stats.getAverage());

		services.stream().filter(s -> s instanceof EmergencyService)
				.forEach(s -> System.out.println("Emergency: " + s.getServiceName()));
	}
}