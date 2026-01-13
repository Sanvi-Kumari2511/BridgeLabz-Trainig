package com.onlineexamreviewsystem;
import java.util.*;

public class ExamProctor {

	    //Stack to track question navigation (Last Visited Question)
	    private Stack<Integer> navigationStack;

	    //HashMap to store student's answers (questionID → answer)
	    private Map<Integer, String> answerMap;

	    //HashMap to store correct answers
	    private Map<Integer, String> correctAnswerMap;

	    //Constructor
	    public ExamProctor() {
	        navigationStack = new Stack<>();
	        answerMap = new HashMap<>();
	        correctAnswerMap = new HashMap<>();
	    }

	   
	    //Adds correct answers (exam setup)
	    public void addCorrectAnswer(int questionId, String answer) {
	        correctAnswerMap.put(questionId, answer);
	    }

	    /*
	     * Tracks question navigation using Stack
	     */
	    public void visitQuestion(int questionId) {
	        navigationStack.push(questionId);
	        System.out.println("Visited Question: " + questionId);
	    }

	    /*
	     * Stores student's answer in HashMap
	     */
	    public void submitAnswer(int questionId, String answer) {
	        answerMap.put(questionId, answer);
	        System.out.println("Answer saved for Question " + questionId);
	    }

	    /*
	     * Function to evaluate score after exam submission
	     */
	    public int evaluateScore() {
	        int score = 0;

	        for (int questionId : correctAnswerMap.keySet()) {
	            String correctAnswer = correctAnswerMap.get(questionId);
	            String studentAnswer = answerMap.get(questionId);

	            if (correctAnswer.equalsIgnoreCase(studentAnswer)) {
	                score++;   // increment score
	            }
	        }
	        return score;
	    }

	    /*
	     * Displays last visited question using Stack
	     */
	    public void showLastVisitedQuestion() {
	        if (!navigationStack.isEmpty()) {
	            System.out.println("Last visited question: " + navigationStack.peek());
	        }
	  }
}

