package com.javacollections.queueinterface;

import java.util.PriorityQueue;

public class HospitalTriage {
	
	    public static void main(String[] args) {

	        //PriorityQueue with comparator: higher severity first
	        PriorityQueue<Patient> queue = new PriorityQueue<>(
	            (p1, p2) -> p2.severity - p1.severity
	        );

	        //Adding patients
	        queue.add(new Patient("John", 3));
	        queue.add(new Patient("Alice", 5));
	        queue.add(new Patient("Bob", 2));

	        System.out.println("Treatment order:");

	        //Treat patients in order of severity
	        while (!queue.isEmpty()) {
	            System.out.println(queue.remove());
	        }
	    }
	}

		