package com.smartsurveyanalyzer;

import java.io.File;
import java.util.*;

public class FeedbackGuruApp {
    public static void main(String[] args) {
    	
    	//Folder containing feedback text files
    	File folder = new File("D:\\testing\\Java Programming Workspace\\java-collections-practice\\java-collections-scenario-practice\\CollectionsScenarioBased\\src\\feedbacks");
    	
    	//Read feedback from files
    	List<String> feedbackLines = FeedbackReader.readFeedbackFiles(folder);
    	
    	//Analyze feedback and categorize them
    	Map<String, List<String>> summary = FeedbackAnalyzer.analyze(feedbackLines, "Service");
    	
    	//Displaying final categorized feedback
    	System.out.println("\n---- Feedback Summary ----");
    	
    	for(String category : summary.keySet()) {
    		System.out.println("\n" + category + "Feedback: ");
    	
    		for(String msg : summary.get(category)) {
    			System.out.println("- " + msg);
    		}
     		
    	}
    }
}









