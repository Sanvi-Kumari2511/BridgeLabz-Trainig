package com.javacollections.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class HighestValueKey {
	public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 60);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        //Iterate over map entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("Key with maximum value: " + maxKey);
    }
}
