package com.javacollections.insurancepolicy;
import java.time.LocalDate;
import java.util.*;

public class RetrievePolicy {

	    // 1. Display all unique policies
	    static void showAllPolicies(Set<Policy> policies) {
	        for (Policy p : policies) {
	            System.out.println(p);
	        }
	    }

	    // 2. Policies expiring within next 30 days
	    static void expiringSoon(Set<Policy> policies) {
	        LocalDate today = LocalDate.now();
	        for (Policy p : policies) {
	            if (!p.expiryDate.isBefore(today) &&
	                p.expiryDate.isBefore(today.plusDays(30))) {
	                System.out.println(p);
	            }
	        }
	    }

	    // 3. Policies with specific coverage type
	    static void byCoverage(Set<Policy> policies, String type) {
	        for (Policy p : policies) {
	            if (p.coverage.equalsIgnoreCase(type)) {
	                System.out.println(p);
	            }
	        }
	    }

	    // 4. Find duplicate policies using policy number
	    static void findDuplicates(List<Policy> list) {
	        Set<Integer> seen = new HashSet<>();
	        for (Policy p : list) {
	            if (!seen.add(p.policyNumber)) {
	                System.out.println("Duplicate Policy: " + p);
	            }
	        }
	    }

	    // Testing
	    public static void main(String[] args) {

	        Policy p1 = new Policy(101, "Rahul",
	                LocalDate.now().plusDays(10), "Health", 12000);
	        Policy p2 = new Policy(102, "Amit",
	                LocalDate.now().plusDays(40), "Auto", 8000);
	        Policy p3 = new Policy(103, "Neha",
	                LocalDate.now().plusDays(20), "Health", 15000);
	        Policy p4 = new Policy(101, "Rahul",
	                LocalDate.now().plusDays(10), "Health", 12000); // duplicate

	        Set<Policy> policySet = new HashSet<>();
	        policySet.add(p1);
	        policySet.add(p2);
	        policySet.add(p3);

	        System.out.println("All Unique Policies:");
	        showAllPolicies(policySet);

	        System.out.println("\nPolicies Expiring Soon:");
	        expiringSoon(policySet);

	        System.out.println("\nHealth Policies:");
	        byCoverage(policySet, "Health");

	        System.out.println("\nDuplicate Policies:");
	        findDuplicates(Arrays.asList(p1, p2, p3, p4));
	    }
}
