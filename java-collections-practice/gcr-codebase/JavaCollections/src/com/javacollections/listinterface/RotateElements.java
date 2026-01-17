package com.javacollections.listinterface;
import java.util.*;

public class RotateElements {
	 public static void main(String[] args) {

	        List<Integer> list = new ArrayList<>();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);

	        //Positions to rotate
	        int k = 2;   

	        int n = list.size();
	        k = k % n;   

	        List<Integer> result = new ArrayList<>();

	        //Adding elements from k to end
	        for (int i = k; i < n; i++) {
	            result.add(list.get(i));
	        }

	        //Adding first k elements at the end
	        for (int i = 0; i < k; i++) {
	            result.add(list.get(i));
	        }

	        System.out.println(result);
	    }
}
