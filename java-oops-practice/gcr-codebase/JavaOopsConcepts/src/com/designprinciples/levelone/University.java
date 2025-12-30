package com.designprinciples.levelone;

import java.util.ArrayList;

public class University {
	private String universityName;
    private ArrayList<DepartmentUniversity> departments; 
    private ArrayList<Faculty> facultyMembers; 

    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        facultyMembers = new ArrayList<>();
    }

    // Composition: create department inside university
    public void addDepartment(String deptName) {
        departments.add(new DepartmentUniversity(deptName));
    }

    // Aggregation: add existing faculty
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void showUniversityDetails() {
        System.out.println("University: " + universityName);

        System.out.println("\nDepartments:");
        for (DepartmentUniversity dept : departments) {
            dept.displayDepartmentUniversity();
        }

        System.out.println("\nFaculty Members:");
        for (Faculty faculty : facultyMembers) {
            faculty.displayFaculty();
        }
    }

    // Simulating deletion of university
    public void deleteUniversity() {
        departments.clear();
        System.out.println("\nUniversity deleted. All departments removed");
    }
}
