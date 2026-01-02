package com.universitycourseenrollmentsystem;

 class Postgraduate extends Student implements Graded{
            
		    Postgraduate(String name, int id) {
		        super(name, id);
		    }

		    //Override
		    public void assignGrade(double marks) {
		        double gradePoint = (marks >= 50) ? 8 : 0;
		        updateGPA(gradePoint);
		    }
		}


