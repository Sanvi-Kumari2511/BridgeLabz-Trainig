package com.designprinciples.levelone;

public class MainUniversity {
	public static void main(String[] args) {

        University university = new University("Technocrats University");

        Faculty f1 = new Faculty(101, "Dr. Bhavna");
        Faculty f2 = new Faculty(102, "Prof. Rinku");

        university.addFaculty(f1);
        university.addFaculty(f2);

        university.addDepartment("Computer Science");
        university.addDepartment("AIML");

        university.showUniversityDetails();

        System.out.println("\nDeleting university\n");
        university.deleteUniversity();

        // Faculty still exists independently
        System.out.println("\nFaculty still exists after university deletion:");
        f1.displayFaculty();
        f2.displayFaculty();
    }
}
