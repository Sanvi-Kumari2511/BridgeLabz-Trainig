package com.streamapi.filteringexpiringmemberships;
import java.time.LocalDate;

class Member {

    String name;
    LocalDate expiryDate;

    //Constructor to initialize meber details
    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    //Getter method for expiry date
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    //toString method (for printing)
    public String toString() {
        return "Member Name : " + name +
               "\nExpiry Date : " + expiryDate;
    }
}
