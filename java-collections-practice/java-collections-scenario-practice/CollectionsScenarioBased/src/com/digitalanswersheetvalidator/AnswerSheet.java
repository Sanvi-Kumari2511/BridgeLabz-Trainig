package com.digitalanswersheetvalidator;

import java.util.List;

public class AnswerSheet <T> {
	
	    String studentName;
	    //Answers list
	    List<T> answers;

	    //Constructor to initialize data
	    AnswerSheet(String studentName, List<T> answers) {
	        this.studentName = studentName;
	        this.answers = answers;
	    }
}
