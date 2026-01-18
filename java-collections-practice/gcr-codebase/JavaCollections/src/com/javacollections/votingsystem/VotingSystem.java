package com.javacollections.votingsystem;
import java.util.*;

public class VotingSystem {
	
	    public static void main(String[] args) {

	        //LinkedHashMap maintains vote insertion order
	        Map<String, Integer> voteOrder = new LinkedHashMap<>();

	        //Cast votes
	        castVote(voteOrder, "Sanvi");
	        castVote(voteOrder, "Shivani");
	        castVote(voteOrder, "Tarun");
	        castVote(voteOrder, "Riyaz");
	        castVote(voteOrder, "Ashutosh");
	        castVote(voteOrder, "Umesh");

	        //HashMap for fast lookup
	        Map<String, Integer> voteCount = new HashMap<>(voteOrder);

	        //TreeMap to display results in sorted order
	        Map<String, Integer> sortedResult = new TreeMap<>(voteCount);

	        System.out.println("Vote Order (LinkedHashMap):");
	        System.out.println(voteOrder);

	        System.out.println("\nVote Count (HashMap):");
	        System.out.println(voteCount);

	        System.out.println("\nSorted Result (TreeMap):");
	        System.out.println(sortedResult);
	    }

	    //Method to cast vote
	    private static void castVote(Map<String, Integer> map, String candidate) {
	        map.put(candidate, map.getOrDefault(candidate, 0) + 1);
	  }
}
