package com.digitalanswersheetvalidator;

import java.io.File;
import java.util.*;

public class ExamScannerApp {

	    public static void main(String[] args) throws Exception {

	    	//CSV file path
	        File file = new File("D:\\testing\\Java Programming Workspace\\java-collections-practice\\java-collections-scenario-practice\\CollectionsScenarioBased\\src\\answersheet\\exam1.csv");

	        //Correct answers (answer key)
	        List<String> answerKey = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

	        //Scan file and get scores
	        Map<String, Integer> scores =
	                ExamScanner.scan(file, answerKey);

	        // PriorityQueue for ranking (highest score first)
	        PriorityQueue<Result> pq = new PriorityQueue<>((a, b) -> b.score - a.score);

	        // Add all students to priority queue
	        scores.forEach((name, score) -> pq.add(new Result(name, score)));

	        //Printing results
	        System.out.println("\n--- Results ---");
	        while (!pq.isEmpty()) {
	            Result r = pq.poll();
	            System.out.println(r.name + " : " + r.score);
	        }
	    }
}