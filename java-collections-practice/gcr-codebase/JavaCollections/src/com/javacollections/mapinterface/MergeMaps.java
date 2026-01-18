package com.javacollections.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
	public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> mergedMap = new HashMap<>(map1); 

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            //If key exists, sum values; otherwise just put
            mergedMap.put(key, mergedMap.getOrDefault(key, 0) + value);
        }

        System.out.println(mergedMap);
    }
}
