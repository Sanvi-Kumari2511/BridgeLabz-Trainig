package com.javagenerics.aidrivenresume;
import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
	 public static void main(String[] args) {

	        //Creating resumes
	        Resume<SoftwareEngineer> r1 =
	                new Resume<>("Sanvi", new SoftwareEngineer());

	        Resume<DataScientist> r2 =
	                new Resume<>("Shivani", new DataScientist());

	        Resume<ProductManager> r3 =
	                new Resume<>("Sandip", new ProductManager());
	        
	        System.out.println();

	        //Process individual resumes
	        r1.processResume();
	        r2.processResume();
	        r3.processResume();

	        System.out.println();
	        
	        //Screening pipeline with wildcard
	        List<JobRole> roles = new ArrayList<>();
	        roles.add(new SoftwareEngineer());
	        roles.add(new DataScientist());
	        roles.add(new ProductManager());

	        ResumeScreeningUtil.screenAll(roles);
	    }
}
