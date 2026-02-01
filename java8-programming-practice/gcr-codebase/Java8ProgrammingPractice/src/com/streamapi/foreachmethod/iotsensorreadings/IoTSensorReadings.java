package com.streamapi.foreachmethod.iotsensorreadings;

import java.util.Arrays;
import java.util.List;

public class IoTSensorReadings {

    public static void main(String[] args) {

        //Creating a list of Sensor readings
        List<Double> readings = Arrays.asList(22.5, 30.2, 18.9, 14.0, 27.3);

        //Threshold value
        double threshold = 20.0;

        //Printing readings above threshold
        readings.stream()
                .filter(reading -> reading > threshold)
                .forEach(reading -> System.out.println("\nHigh Reading: " + reading));
    }
}
