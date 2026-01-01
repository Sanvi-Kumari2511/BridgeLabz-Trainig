package day1Practice;
import java.util.*;

public class Uniqueness {

	    public static void main(String[] args) {

	        int[] numbers = {1, 2, 2, 3, 4, 4};

	        Set<Integer> unique = new HashSet<>();

	        for (int n : numbers) {
	            unique.add(n);
	        }

	        System.out.println(unique);
	    }
}
