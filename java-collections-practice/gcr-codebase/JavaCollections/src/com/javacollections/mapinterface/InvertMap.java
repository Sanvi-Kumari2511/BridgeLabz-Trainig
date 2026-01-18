package com.javacollections.mapinterface;

import java.util.*;


public class InvertMap {
	public static void main(String[] args) {

        //Original map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 2);

        //Inverted map
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            //If value already exists in inverted map, add key to its list
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        System.out.println(invertedMap);
    }
}
