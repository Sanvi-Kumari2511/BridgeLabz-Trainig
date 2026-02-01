package com.streamapi.hospitaldoctoravailability;
class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    //Constructor to initialize doctor details
    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    @Override
    public String toString() {
        return "Doctor Name : " + name +
               "\nSpecialty   : " + specialty +
               "\nAvailable on Weekend : " + availableOnWeekend + "\n";
    }
}
