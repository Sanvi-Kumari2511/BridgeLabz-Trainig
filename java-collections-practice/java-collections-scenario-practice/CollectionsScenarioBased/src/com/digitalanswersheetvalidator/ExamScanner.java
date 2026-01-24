package com.digitalanswersheetvalidator;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner {

	    //Regex pattern
	    private static final Pattern VALID_LINE =
	            Pattern.compile("^[A-Za-z ]+(,[A-D])+$");

	     //This method scans the CSV file and calculates scores
	    public static Map<String, Integer> scan(File file, List<String> answerKey)
	            throws IOException {

	    	//Map to store student name and score
	        Map<String, Integer> resultMap = new HashMap<>();

	        //BufferedReader for reading file line by line
	        BufferedReader br = new BufferedReader(new FileReader(file));
	        String line;

	        while ((line = br.readLine()) != null) {

	            //Regex validation
	            if (!VALID_LINE.matcher(line).matches()) {
	                System.out.println("Invalid format skipped: " + line);
	                continue;
	            }

	            //Split CSV line
	            String[] parts = line.split(",");
	            String name = parts[0];

	            int score = 0;
	            
	            //Compare student answers with answer key
	            for (int i = 1; i < parts.length && i <= answerKey.size(); i++) {
	                if (parts[i].equals(answerKey.get(i - 1))) {
	                    score++;
	                }
	            }

	            //Store result in map
	            resultMap.put(name, score);
	        }

	        br.close();
	        return resultMap;
	    }
}  
