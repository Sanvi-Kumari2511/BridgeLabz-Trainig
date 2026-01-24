package com.resumeanalyzer;

public class ResumeData {
	String email;        
    String phone;       
    int skillCount;      

    //Constructor to initialize resume details
    ResumeData(String email, String phone, int skillCount) {
        this.email = email;
        this.phone = phone;
        this.skillCount = skillCount;
    }

    //Method to display resume details
    void show() {
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Skills Matched: " + skillCount);
        System.out.println("----------------------");
    }
}
