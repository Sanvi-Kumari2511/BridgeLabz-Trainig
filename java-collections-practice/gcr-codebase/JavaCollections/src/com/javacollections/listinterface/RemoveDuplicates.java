package com.javacollections.listinterface;
import java.util.*;

public class RemoveDuplicates {
	 public static void main(String[] args) {

	        List<Integer> list = new ArrayList<>();
	        list.add(3);
	        list.add(1);
	        list.add(2);
	        list.add(2);
	        list.add(3);
	        list.add(4);

	        List<Integer> result = new ArrayList<>();

	        //Loop through original list
	        for (int i = 0; i < list.size(); i++) {

	            //Adding only if not already present
	            if (!result.contains(list.get(i))) {
	                result.add(list.get(i));
	            }
	        }

	        System.out.println(result);
	    }
}
