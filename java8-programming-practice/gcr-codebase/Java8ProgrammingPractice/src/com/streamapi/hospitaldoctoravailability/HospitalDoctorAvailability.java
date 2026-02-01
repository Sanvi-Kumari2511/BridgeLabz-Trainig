package com.streamapi.hospitaldoctoravailability;
import java.util.*;
import java.util.stream.*;

public class HospitalDoctorAvailability {
    public static void main(String[] args) {

    	//Creating a list of doctors
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Mehta", "Cardiology", true),
            new Doctor("Dr. Anjali", "Neurology", false),
            new Doctor("Dr. Sanvi", "Orthopedic", true),
            new Doctor("Dr. Sharma", "Dermatology", true)
        );

        //Displaying output
        System.out.println("Doctors available on weekends (Sorted by Specialty):\n");

        doctors.stream()
               .filter(d -> d.availableOnWeekend)      
               .sorted(Comparator.comparing(d -> d.specialty)) 
               .forEach(d -> System.out.println(d));          
    }
}
