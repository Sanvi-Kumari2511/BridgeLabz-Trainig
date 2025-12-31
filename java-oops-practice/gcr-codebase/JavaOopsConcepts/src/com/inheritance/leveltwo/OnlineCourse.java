package com.inheritance.leveltwo;

class OnlineCourse extends Course {
	
	    String platform;
	    boolean isRecorded;

	    //Constructor
	    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
	        super(courseName, duration);
	        this.platform = platform;
	        this.isRecorded = isRecorded;
	    }

	    //Override
	    String getCourseDetails() {
	        return super.getCourseDetails() + ", Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No");
	    }
	}


