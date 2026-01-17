package com.javacollections.listinterface;
import java.util.*;

public class ReverseArrayList {
     public static void main(String args []) {
    	 
    	 //Creating an ArrayList usingList interface
    	 List<Integer> list = new ArrayList<>();
    	 
    	 //Adding elements to the list
    	 list.add(1);
    	 list.add(2);
    	 list.add(3);
    	 list.add(4);
    	 list.add(5);
    	     	
    	 int i = 0;
    	 int j = list.size() - 1;
    	 
    	 
    	 //Swapping elements from start and end
    	 while(i < j) {
    		 
    		 int temp = list.get(i);
    		 list.set(i,  list.get(j));
    		 list.set(j, temp);
    		 
    		
    		 i++;
      		 j--;
    		 
    	 }
    	 
    	 //Displaying reversed list
    	 System.out.println(list);
     }
}
