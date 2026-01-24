package com.smartsurveyanalyzer;

import java.util.*;
import java.util.regex.*;

public class FeedbackAnalyzer {
	
	//Categories feedback into positive, neutral, or negative
	public static Map<String, List<String>> analyze(List<String> feedbacks, String type){
		
     //Map to store cetegorized feedback
	 Map<String, List<String>> result = new HashMap<>();
	 result.put("Positive", new ArrayList<>());
	 result.put("Neutral", new ArrayList<>());
	 result.put("Negative", new ArrayList<>());
	  
	 //Regex pattern to extract rating 
	 Pattern ratingPattern = Pattern.compile("(\\d{1,2})/10");
	   for(String feedback : feedbacks) {
		   
		   try {
			   Matcher matcher = ratingPattern.matcher(feedback);
			   
			   //If rating not found skip the feedback
			   if(!matcher.find()) {
				   throw new IllegalArgumentException("Rating n ot found");
	           }  
			   
			   //Convert extracted rating to integer
			   int rating = Integer.parseInt(matcher.group(1));
			   
			   //Create feedback object using generics
			   Feedback<String> fb = new Feedback<>(type, feedback, rating);
			   
			  //Categorize feedback based on rating
			   if(rating >= 8) {
				   result.get("Positive").add(fb.getMessage());
			   }
			   
			   else if(rating >= 5) {
				   result.get("Neutral").add(fb.getMessage());
			   }
			   
			   else {
				   result.get("Negative").add(fb.getMessage());
			   }
			   
		   }
		   
		   catch (Exception e){
			   //Handles invalid or missing rating lines
			   System.out.println("Skipped invalid feedback: " + feedback);
		   }
		   
	   }
	   
	   return result;
	}
			   
}


