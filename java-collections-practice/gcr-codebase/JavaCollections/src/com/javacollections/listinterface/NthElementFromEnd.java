package com.javacollections.listinterface;
import java.util.*;

public class NthElementFromEnd {
	public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        //Nth element from end
        int n = 2;  

        int first = 0;
        int second = 0;

        //Move first pointer n steps ahead
        for (int i = 0; i < n; i++) {
            first++;
        }

        //Move both pointers until first reaches end
        while (first < list.size()) {
            first++;
            second++;
        }

        System.out.println(list.get(second));
    }
}
