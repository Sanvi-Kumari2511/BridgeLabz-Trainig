package com.javacollections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;


public class GenerateBinaryNumbers {
	static void generateBinary(int n) {

        Queue<String> queue = new LinkedList<>();
        //First binary number
        queue.add("1");  

        for (int i = 1; i <= n; i++) {

        	//Getting front element
            String current = queue.remove();
            
            //printing binary number
            System.out.println(current);

            //Adding next binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generateBinary(n);
    }
}
