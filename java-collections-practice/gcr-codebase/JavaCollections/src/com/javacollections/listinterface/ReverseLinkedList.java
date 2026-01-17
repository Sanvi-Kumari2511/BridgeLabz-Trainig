package com.javacollections.listinterface;
import java.util.*;

public class ReverseLinkedList {
	
	public static void main(String args []) {
	 List<Integer> list = new LinkedList<>();
	
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);

     int i = 0;
     int j = list.size() - 1;

     //Reverse using two pointers
     while (i < j) {
         int temp = list.get(i);
         list.set(i, list.get(j));
         list.set(j, temp);

         i++;
         j--;
     }

     System.out.println(list);
    }
}


