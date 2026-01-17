package com.javacollections.listinterface;
import java.util.*;

public class FrequencyOfElements {
   public static void main(String args []) {
	    
	   String[] arr = {"apple", "banana", "apple", "orange"};
	   
	   Map<String, Integer> map = new HashMap<>();
	   
	   //Counting each element
	   for (int i = 0; i < arr.length; i++) {
		   if (map.containsKey(arr[i])) {
               map.put(arr[i], map.get(arr[i]) + 1);
           } else {
               map.put(arr[i], 1);
           }
       }

       System.out.println(map);
   }
}
