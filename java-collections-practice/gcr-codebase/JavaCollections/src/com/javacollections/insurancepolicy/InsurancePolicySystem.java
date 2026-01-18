package com.javacollections.insurancepolicy;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicySystem {

    public static void main(String[] args) {

        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedHashSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        Policy p1 = new Policy(101, "Rahul",
                LocalDate.of(2026, 5, 20), "Health", 12000);
        Policy p2 = new Policy(102, "Amit",
                LocalDate.of(2025, 3, 15), "Auto", 8000);
        Policy p3 = new Policy(103, "Neha",
                LocalDate.of(2027, 1, 10), "Home", 15000);

        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);

        linkedHashSet.addAll(hashSet);
        treeSet.addAll(hashSet);

        System.out.println("HashSet (Fast, No Order):");
        System.out.println(hashSet);

        System.out.println("\nLinkedHashSet (Insertion Order):");
        System.out.println(linkedHashSet);

        System.out.println("\nTreeSet (Sorted by Expiry Date):");
        System.out.println(treeSet);
    }
}
