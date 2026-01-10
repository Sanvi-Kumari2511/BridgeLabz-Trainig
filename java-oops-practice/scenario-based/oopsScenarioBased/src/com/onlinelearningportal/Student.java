package com.onlinelearningportal;

public class Student extends User implements ICertifiable {

	    private int progress;    
	    private int score;       

	    //Constructor to initialize student's details
	    public Student(String name) {
	        super(name);
	        this.progress = 0;
	        this.score = 0;
	    }

	    //Update progress using operator
	    public void updateProgress(int value) {
	        progress += value;   
	    }

	    //Add marks using operator
	    public void addScore(int marks) {
	        score += marks;      // operator usage
	    }

	    //Polymorphic certificate generation (Override)
	    public void generateCertificate() {
	        if (progress >= 100 && score >= 60) {
	            System.out.println("Certificate issued to " + name + " (at student Level)");
	        } 
	        else {
	            System.out.println("Course not completed yet");
	        }
	   }
 }
	
