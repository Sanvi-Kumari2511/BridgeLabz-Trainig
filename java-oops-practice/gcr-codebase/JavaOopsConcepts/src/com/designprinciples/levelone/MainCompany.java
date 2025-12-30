package com.designprinciples.levelone;

public class MainCompany {
	
	    public static void main(String[] args) {

	        Company company = new Company("Tech Solutions");

	        Department dev = new Department("Development");
	        dev.addEmployee(156, "Sanvi");
	        dev.addEmployee(160, "Rishu");

	        Department hr = new Department("HR");
	        hr.addEmployee(200, "Rudra");

	        company.addDepartment(dev);
	        company.addDepartment(hr);

	        company.showCompanyDetails();

	        System.out.println("\nDeleting company\n");
	        company.deleteCompany();
	    }
	}

