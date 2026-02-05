package com.collectors.studentresultgrouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {
	
	public static void main(String args []) {
		
		   //Creating a list of students
		   List<Student> students = List.of
				   (new Student("Sanvi", 10),
				    new Student("Shivani", 9),
				    new Student("Sandip", 10),
				    new Student("Ashu", 8)
				   );
		   
		   //Group by grade and collect student names
		   Map<Integer, List<String>> result = 
				   students.stream()
				           .collect(Collectors.groupingBy(Student::getGrade,
		                  		    Collectors.mapping(Student::getName, Collectors.toList())
				            ));
		   
		   //Printing results
		   result.forEach((grade, names) -> System.out.println("Grade " + grade + " : " + names));
		   
	}

}
