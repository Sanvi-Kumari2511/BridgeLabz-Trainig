package com.smartsurveyanalyzer;

import java.io.*;
import java.util.*;

public class FeedbackReader {
	public static List<String> readFeedbackFiles(File folder){
		List<String> feedbackList = new ArrayList<>();
		
		try {
			
			//Check if folder exists and is valid
			if(!folder.exists() || !folder.isDirectory()) {
				throw new IOException("Invalid feedback folder");
			}
			
			//Loop through all files inside the folder
			for(File file : folder.listFiles()) {
				
				//Process only .txt files
				if(!file.getName().endsWith(".txt")) {
					continue;
				}
				
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line;
				
				//Read file line by line
				while((line = reader.readLine()) != null) {
					feedbackList.add(line);
				}
				
				reader.close();
			}
		}
			
			catch(Exception e) {
				System.out.println("Error while reading files: " + e.getMessage());
			}
			
			return feedbackList;
	
	}

}
