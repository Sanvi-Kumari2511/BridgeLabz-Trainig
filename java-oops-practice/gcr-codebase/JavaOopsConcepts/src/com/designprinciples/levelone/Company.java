package com.designprinciples.levelone;
import java.util.ArrayList;

public class Company {
	
	    private String companyName;
	    private ArrayList<Department> departments;

	    public Company(String companyName) {
	        this.companyName = companyName;
	        departments = new ArrayList<>();
	    }

	    // Creating Department inside Company (composition)
	    public void addDepartment(Department department) {
	        departments.add(department);
	    }

	    public void showCompanyDetails() {
	        System.out.println("Company: " + companyName);
	        for (Department dept : departments) {
	            dept.showEmployees();
	        }
	    }

	    // Simulating deletion of company
	    public void deleteCompany() {
	        departments.clear();
	        System.out.println("Company deleted. All departments and employees removed");
	    }
	}


