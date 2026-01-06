package com.edumentor;

public class Learner extends User implements ICertifiable {
	
	    private int totalScore = 0;
	    private int quizzesTaken = 0;
        
	    //Constructor to access the learner's details
	    public Learner(String name, String email, int userId) {
	        super(name, email, userId);
	    }
        
	    //Method for quiz
	    public void takeQuiz(Quiz quiz) {
	        System.out.println(name + " is taking quiz: " + quiz.getTitle());
	        totalScore += quiz.calculateScore();
	        quizzesTaken++;
	    }

	    //Override
	    public void generateCertificate() {
	        double average = (quizzesTaken == 0) ? 0 : (totalScore * 100.0 / (quizzesTaken * 100));
	        System.out.println("Certificate for " + name + ": Average Score = " + String.format("%.2f", average) + "%");
	    }
	}


