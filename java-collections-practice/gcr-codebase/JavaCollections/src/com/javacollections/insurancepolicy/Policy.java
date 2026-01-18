package com.javacollections.insurancepolicy;
import java.time.LocalDate;
import java.util.*;

class Policy implements Comparable<Policy> {

	int policyNumber;
    String name;
    LocalDate expiryDate;
    String coverage;
    double premium;

    Policy(int policyNumber, String name, LocalDate expiryDate,
           String coverage, double premium) {
        this.policyNumber = policyNumber;
        this.name = name;
        this.expiryDate = expiryDate;
        this.coverage = coverage;
        this.premium = premium;
    }

    @Override
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy p = (Policy) o;
        return policyNumber == p.policyNumber;
    }

    @Override
    public int hashCode() {
        return policyNumber;
    }

    @Override
    public String toString() {
        return policyNumber + " - " + name + " - " + expiryDate;
    }
}
