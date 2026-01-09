package com.algorithmruntimeanalysis;

public class StringConcatenation {
	
	    public static void main(String[] args) {

	        int number = 100000; 

	        long start, end;

	        //Using String
	        start = System.nanoTime();
	        String str = "";
	        
	        for (int i = 0; i < number; i++) {
	            str = str + "a";
	        }
	        
	        end = System.nanoTime();
	        System.out.println("String Time: " + (end - start) / 1000000.0 + " ms");

	        
	        //Using StringBuilder
	        start = System.nanoTime();
	        StringBuilder sb = new StringBuilder();
	        
	        for (int i = 0; i < number; i++) {
	            sb.append("a");
	        }
	        
	        end = System.nanoTime();
	        System.out.println("StringBuilder Time: " + (end - start) / 1000000.0 + " ms");

	        
	        //Using StringBuffer
	        start = System.nanoTime();
	        StringBuffer sbf = new StringBuffer();
	        
	        for (int i = 0; i < number; i++) {
	            sbf.append("a");
	        }
	        
	        end = System.nanoTime();
	        System.out.println("StringBuffer Time: " + (end - start) / 1_000_000.0 + " ms");
	    }
	}

