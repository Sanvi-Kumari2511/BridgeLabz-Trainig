package day1Practice;
import java.util.*;

public class Frequency {

	    public static void main(String[] args) {

	        String[] words = {"Java", "Python", "Java", "AI"};

	        Map<String, Integer> freq = new HashMap<>();

	        for (String word : words) {
	            freq.put(word, freq.getOrDefault(word, 0) + 1);
	        }

	        System.out.println(freq);
	    }
	}

