package com.inheritance.leveltwo;

class PaidOnlineCourse extends OnlineCourse {
	    double fee;
	    double discount; 
	    //Constructor
	    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
	        super(courseName, duration, platform, isRecorded);
	        this.fee = fee;
	        this.discount = discount;
	    }

	    //Override
	    String getCourseDetails() {
	        double finalFee = fee - (fee * discount / 100);
	        return super.getCourseDetails() + ", Fee: ₹" + fee + ", Discount: " + discount + "%" + ", Final Fee: ₹" + finalFee;
	    }
	}
