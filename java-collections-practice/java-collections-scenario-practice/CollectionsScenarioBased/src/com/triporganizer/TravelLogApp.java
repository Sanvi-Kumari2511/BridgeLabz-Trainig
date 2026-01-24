package com.triporganizer;

import java.util.*;

public class TravelLogApp {
	public static void main(String[] args) {

        try {
            //Creating sample trip entries
            List<Trip> trips = new ArrayList<>();
            trips.add(new Trip("Delhi", "India", 8, "Historical Monuments"));
            trips.add(new Trip("Rome", "Italy", 5, "Explored museums and cafes"));
            trips.add(new Trip("Delhi", "India", 7, "Street photography"));
            trips.add(new Trip("Berlin", "Germany", 9, "Tech and culture"));

            //Save trips to file
            TripFileManager.saveTrips(trips, "trips.dat");

            //Load trips from file
            List<Trip> loadedTrips = TripFileManager.loadTrips("trips.dat");

            //Analyze data
            TripAnalyzer.extractCities(loadedTrips);
            TripAnalyzer.longTrips(loadedTrips);
            TripAnalyzer.uniqueCountries(loadedTrips);
            TripAnalyzer.topCities(loadedTrips);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
