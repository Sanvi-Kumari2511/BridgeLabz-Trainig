package com.triporganizer;

import java.util.*;
import java.util.regex.*;

public class TripAnalyzer {
	//Find all cities using regex
    public static void extractCities(List<Trip> trips) {
        Pattern pattern = Pattern.compile("[A-Za-z ]+");

        System.out.println("Cities visited:");
        for (Trip t : trips) {
            Matcher matcher = pattern.matcher(t.city);
            if (matcher.find()) {
                System.out.println("- " + matcher.group());
            }
        }
    }

    //Trips longer than 5 days
    public static void longTrips(List<Trip> trips) {
        System.out.println("\nTrips longer than 5 days:");
        for (Trip t : trips) {
            if (t.durationDays > 5) {
                System.out.println(t.city + " (" + t.durationDays + " days)");
            }
        }
    }

    //Unique countries using Set
    public static void uniqueCountries(List<Trip> trips) {
        Set<String> countries = new HashSet<>();

        for (Trip t : trips) {
            countries.add(t.country);
        }

        System.out.println("\nUnique countries visited:");
        for (String c : countries) {
            System.out.println("- " + c);
        }
    }

    //Top 3 most visited cities
    public static void topCities(List<Trip> trips) {
        Map<String, Integer> cityCount = new HashMap<>();

        for (Trip t : trips) {
            cityCount.put(t.city, cityCount.getOrDefault(t.city, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(cityCount.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("\nTop 3 most visited cities:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i).getKey() + " → " + list.get(i).getValue() + " times");
        }
    }
}
