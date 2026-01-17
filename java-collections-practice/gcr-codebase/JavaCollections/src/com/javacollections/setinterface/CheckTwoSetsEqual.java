package com.javacollections.setinterface;
import java.util.*;

public class CheckTwoSetsEqual {
    
	public static void main(String args []) {
		
		//Set1
		Set<Integer> set1 = new HashSet<>();
		 set1.add(1);
		 set1.add(2);
		 set1.add(3);
		
		 //Set2
		 Set<Integer> set2 = new HashSet<>();
		 set2.add(2);
		 set2.add(1);
		 set2.add(3);
		 
		 //Check both sets are equal or not
		 boolean equal = set1.equals(set2);
		 
		 System.out.println(equal);
	}
}
