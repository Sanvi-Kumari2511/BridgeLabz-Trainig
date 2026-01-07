package com.challengeproblem;

public class CompareStringBuilderAndStringBuffer {
	
	    public static void main(String[] args) {
            
	    	//Number of times to concatenate
	        int n = 1_000_000;        
	        String str = "sanvi";    

	        // ---------- StringBuilder ----------
	        StringBuilder sb = new StringBuilder();
	        long startBuilder = System.nanoTime();   

	        for (int i = 0; i < n; i++) {
	            sb.append(str);
	        }

	        long endBuilder = System.nanoTime();     
	        long timeBuilder = endBuilder - startBuilder;

	        // ---------- StringBuffer ----------
	        StringBuffer sbf = new StringBuffer();
	        long startBuffer = System.nanoTime();  

	        for (int i = 0; i < n; i++) {
	            sbf.append(str);
	        }

	        long endBuffer = System.nanoTime();     
	        long timeBuffer = endBuffer - startBuffer;

	        // ---------- Results ----------
	        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");
	        System.out.println("Time taken by StringBuffer : " + timeBuffer + " ns");
	    }
	}

