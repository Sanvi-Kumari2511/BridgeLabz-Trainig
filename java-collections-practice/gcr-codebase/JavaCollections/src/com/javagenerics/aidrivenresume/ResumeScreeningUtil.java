package com.javagenerics.aidrivenresume;
import java.util.List; 

public class ResumeScreeningUtil {
	//Wildcard method to screen resumes of any job role
    public static void screenAll(List<? extends JobRole> roles) {

        System.out.println("Screening resumes for roles:");

        for (JobRole role : roles) {
            System.out.println("- " + role.getRoleName());
        }
    }
}
