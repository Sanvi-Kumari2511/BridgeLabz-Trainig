package com.stringbuffer;

public class CompareStringBufferWithStringBuilder {

	    public static void main(String[] args) {

	        int number = 100000;

	        //StringBuffer
	        long start1 = System.nanoTime();
	        StringBuffer sb1 = new StringBuffer();

	        for (int i = 0; i < number; i++) {
	            sb1.append("hello");
	        }

	        long end1 = System.nanoTime();

	        //StringBuilder
	        long start2 = System.nanoTime();
	        StringBuilder sb2 = new StringBuilder();

	        for (int i = 0; i < number; i++) {
	            sb2.append("hello");
	        }

	        long end2 = System.nanoTime();

	        //Displaying results
	        System.out.println("Time of string buffer is: " + (end1 - start1) + " ns");
	        System.out.println("Time of string builder is: " + (end2 - start2) + " ns");
	    }
	}
