package com.edumentor;

public class Quiz {
	
	    private String title;
	    private String[] questions;
	    private final String[] answers; 
	    private int score = 0;
        
	    //Constructor to initialize the quiz details
	    public Quiz(String title, String[] questions, String[] answers) {
	        this.title = title;
	        this.questions = questions;
	        this.answers = answers.clone(); 
	    }
        
	    //Method to get title
	    public String getTitle() {
	        return title;
	    }

	    //Method to calculating score
	    public int calculateScore() {
	        score = answers.length * 10;
	        return score;
	    }

	    public String[] getAnswers() {
	        return answers.clone(); 
	    }
	}


