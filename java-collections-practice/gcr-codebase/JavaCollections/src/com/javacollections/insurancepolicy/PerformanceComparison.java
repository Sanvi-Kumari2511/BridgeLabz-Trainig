package com.javacollections.insurancepolicy;
import java.time.LocalDate;
import java.util.*;

public class PerformanceComparison {

	    static void testPerformance(Set<Policy> set, Policy policy) {

	        long start, end;

	        // Add
	        start = System.nanoTime();
	        set.add(policy);
	        end = System.nanoTime();
	        System.out.println("Add time: " + (end - start));

	        // Search
	        start = System.nanoTime();
	        set.contains(policy);
	        end = System.nanoTime();
	        System.out.println("Search time: " + (end - start));

	        // Remove
	        start = System.nanoTime();
	        set.remove(policy);
	        end = System.nanoTime();
	        System.out.println("Remove time: " + (end - start));
	    }

	    public static void main(String[] args) {

	        Policy policy = new Policy(101, "Rahul",
	                LocalDate.now().plusDays(10), "Health", 12000);

	        System.out.println("HashSet Performance:");
	        testPerformance(new HashSet<>(), policy);

	        System.out.println("\nLinkedHashSet Performance:");
	        testPerformance(new LinkedHashSet<>(), policy);

	        System.out.println("\nTreeSet Performance:");
	        testPerformance(new TreeSet<>(), policy);
	  }
}
