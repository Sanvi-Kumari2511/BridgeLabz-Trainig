package com.javacollections.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
	 public static void main(String[] args) {

	        Set<Integer> set1 = new HashSet<>();
	        set1.add(1);
	        set1.add(2);
	        set1.add(3);

	        Set<Integer> set2 = new HashSet<>();
	        set2.add(3);
	        set2.add(4);
	        set2.add(5);

	        //Copy set1 to result
	        Set<Integer> result = new HashSet<>(set1);

	        //Remove common elements
	        result.removeAll(set2);

	        //Add elements unique to set2
	        Set<Integer> temp = new HashSet<>(set2);
	        temp.removeAll(set1);
	        result.addAll(temp);

	        System.out.println(result); 
	 }
}
