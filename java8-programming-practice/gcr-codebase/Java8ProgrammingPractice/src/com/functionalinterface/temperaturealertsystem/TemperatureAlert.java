package com.functionalinterface.temperaturealertsystem;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        //Creating a list of temperature readings
        List<Double> temperatures = Arrays.asList(36.5, 38.2, 37.0, 39.5, 36.8);

        //Define threshold
        double threshold = 36.0;

        //Predicate to check if temperature exceeds threshold
        Predicate<Double> isHighTemp = temp -> temp > threshold;

        //Check each temperature and alert if high
        System.out.println("Temperature Alerts:");
        for (Double temp : temperatures) {
            if (isHighTemp.test(temp)) {
                System.out.println("Alert! High temperature detected: " + temp + "°C");
            }
        }
    }
}
