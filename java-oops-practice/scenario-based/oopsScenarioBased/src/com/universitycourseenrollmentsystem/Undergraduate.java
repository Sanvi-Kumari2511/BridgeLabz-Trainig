package com.universitycourseenrollmentsystem;

 class Undergraduate extends Student implements Graded {
	        
	        //Constructor
		    Undergraduate(String name, int id) {
		        super(name, id);
		    }

		    //Override
		    public void assignGrade(double marks) {
		        double gradePoint;

		        if (marks >= 90) gradePoint = 10;
		        else if (marks >= 75) gradePoint = 8;
		        else if (marks >= 60) gradePoint = 6;
		        else gradePoint = 4;

		        updateGPA(gradePoint);
		    }
		}


