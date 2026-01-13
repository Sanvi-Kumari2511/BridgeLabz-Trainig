package com.onlineexamreviewsystem;

public class ExamProctorApp {

	    public static void main(String[] args) {

	        ExamProctor exam = new ExamProctor();

	        // Setup correct answers
	        exam.addCorrectAnswer(1, "A");
	        exam.addCorrectAnswer(2, "C");
	        exam.addCorrectAnswer(3, "B");

	        // Student navigation
	        exam.visitQuestion(1);
	        
	        exam.submitAnswer(1, "A");

	        System.out.println();
	        
	        exam.visitQuestion(2);
	        exam.submitAnswer(2, "C");

	        System.out.println();
	        
	        exam.visitQuestion(3);
	        exam.submitAnswer(3, "D"); // wrong answer

	        // Show last visited question
	        exam.showLastVisitedQuestion();

	        // Evaluate score
	        int score = exam.evaluateScore();
	        
	        System.out.println();
	        
	        System.out.println("Final Score: " + score);
	    }
	    
}
