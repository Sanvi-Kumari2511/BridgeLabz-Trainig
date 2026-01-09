package com.algorithmruntimeanalysis;
import java.util.HashSet;
import java.util.TreeSet;

public class SearchingDataStructureComparison {

	    public static void main(String[] args) {

	        int number = 1000000;
	        int target = number - 1;

	        int[] array = new int[number];
	        HashSet<Integer> hashSet = new HashSet<>();
	        TreeSet<Integer> treeSet = new TreeSet<>();

	        //Fill data structures
	        for (int i = 0; i < number; i++) {
	        	
	            array[i] = i;
	            hashSet.add(i);
	            treeSet.add(i);
	        }

	        long start, end;

	        //Array Search
	        start = System.nanoTime();
	        for (int i = 0; i < number; i++) {
	        	
	            if (array[i] == target)
	                break;
	        }
	        
	        end = System.nanoTime();
	        System.out.println("Array Search Time: " + (end - start) / 1000000.0 + " ms");

	        //HashSet Search
	        start = System.nanoTime();
	        hashSet.contains(target);
	        end = System.nanoTime();
	        
	        System.out.println("HashSet Search Time: " + (end - start) / 1000000.0 + " ms");

	        //TreeSet Search
	        start = System.nanoTime();
	        treeSet.contains(target);
	        end = System.nanoTime();
	        
	        System.out.println("TreeSet Search Time: " + (end - start) / 1000000.0 + " ms");
	    }
	}

