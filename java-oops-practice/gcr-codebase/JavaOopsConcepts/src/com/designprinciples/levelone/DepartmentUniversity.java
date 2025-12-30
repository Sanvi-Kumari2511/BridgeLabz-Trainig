package com.designprinciples.levelone;

public class DepartmentUniversity {
	 private String departmentName;

	    public DepartmentUniversity(String departmentName) {
	        this.departmentName = departmentName;
	    }

	    public void displayDepartmentUniversity() {
	        System.out.println("Department: " + departmentName);
	    }
}
