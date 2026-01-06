package com.edumentor;

public class PersonalizedLearningPlatform {

	    public static void main(String[] args) {
	        //Instructor
	        Instructor instructor = new Instructor("Ritu", "ritu@edumentor.com", 101);
	        instructor.generateCertificate();

	        //Learner
	        Learner learner = new Learner("Sanvi", "sanvi@edumentor.com", 201);

	        //Creating quizzes
	        String[] questions1 = {"Q1: 2+2?", "Q2: Capital of India?"};
	        String[] answers1 = {"4", "New Delhi"};

	        String[] questions2 = {"Q1: 5*5?", "Q2: Color of sky?"};
	        String[] answers2 = {"25", "Blue"};

	        Quiz quiz1 = new Quiz("Math & Geography", questions1, answers1);
	        Quiz quiz2 = new Quiz("Science & General Knowledge", questions2, answers2);

	        //Learner takes quizzes
	        learner.takeQuiz(quiz1);
	        learner.takeQuiz(quiz2);

	        //Generate certificate for learner
	        learner.generateCertificate();
	    }
	}
