package com.triporganizer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TripFileManager {
	//Save trips to file
    public static void saveTrips(List<Trip> trips, String fileName) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        out.writeObject(trips);
        out.close();
    }

    //Read trips from file
    @SuppressWarnings("unchecked")
    public static List<Trip> loadTrips(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        List<Trip> trips = (List<Trip>) in.readObject();
        in.close();
        return trips;
    }
}
