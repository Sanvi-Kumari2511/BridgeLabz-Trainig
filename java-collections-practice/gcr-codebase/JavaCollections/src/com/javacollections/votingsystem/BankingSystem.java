package com.javacollections.votingsystem;
import java.util.*;

public class BankingSystem {
	 public static void main(String[] args) {

	        //HashMap
	        Map<Integer, Integer> accounts = new HashMap<>();
	        accounts.put(1, 10000);
	        accounts.put(2, 5000);
	        accounts.put(3, 9000);

	        //Queue to process withdrawal requests
	        Queue<Integer> withdrawalQueue = new LinkedList<>();
	        withdrawalQueue.add(1);
	        withdrawalQueue.add(3);
	        withdrawalQueue.add(2);

	        System.out.println("Processing Withdrawals (1000 each):");

	        while (!withdrawalQueue.isEmpty()) {
	            int accNo = withdrawalQueue.remove();

	            if (accounts.get(accNo) >= 1000) {
	                accounts.put(accNo, accounts.get(accNo) - 1000);
	                System.out.println("Withdrawal successful for Account " + accNo);
	            } else {
	                System.out.println("Insufficient balance for Account " + accNo);
	            }
	        }

	        //TreeMap to sort customers by balance
	        Map<Integer, List<Integer>> sortedByBalance = new TreeMap<>();

	        for (Map.Entry<Integer, Integer> entry : accounts.entrySet()) {
	            sortedByBalance
	                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
	                .add(entry.getKey());
	        }

	        System.out.println("\nCustomers Sorted by Balance:");
	        System.out.println(sortedByBalance);
	    }
}
