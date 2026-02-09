package com.streams.student;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.*;

public class StudentMain {
   public static void main(String args []) {
	   List<Student> students = Arrays.asList(
			   new Student("Sanvi", "Singh", 1, 21, "Female", "Computer", "Patna", 1, Arrays.asList("114512222", "34575497")),
			   new Student("Shivani", "Lowanshi", 2, 22, "Female", "Electronics", "Karnataka", 54, Arrays.asList("1234567")),
			   new Student("Sandip", "Verma", 3, 23, "Male", "Biotech", "Ranchi", 5, Arrays.asList("34567753")),
			   new Student("Ashutosh", "Sen", 4, 26, "Male", "Mechanical", "Mumbai", 60, Arrays.asList("1298763"))
	   );
	   
	   
	   //....... Basic Filtering .......
	   
	   System.out.println("\n=== Basic Filtering ===");
	   
	  //1. Student's rank is less than 50
	  System.out.println("\n Rank less than 50: ");
	  students.stream()
	          .filter(s -> s.getRank() < 50)
	          .forEach(System.out::println);
	  
	  //2. Student's age is greater than 25
	  System.out.println("\n Age greater than 25: ");
	  students.stream()
	          .filter(s -> s.getAge() > 25)
	          .forEach(System.out::println);
	  
	  //3. All students name
	  System.out.println("\n Students name: ");
	  students.stream()
	          .map(Student::getName)
	          .forEach(System.out::println);
	  
	  
	  //4. Students belong to Mechanical Engineering
	  System.out.println("\n Students belong to Mechanical Department: ");
	  students.stream()   
	          .filter(s -> s.getDepartment().equals("Mechanical"))
	          .forEach(System.out::println);
	  
	  
	  //5. Students not from Mumbai
	  System.out.println("\n Students not from Mumbai: ");
	  students.stream()
	          .filter(s -> !s.getCity().equals("Mumbai"))
	          .forEach(System.out::println);
	  
	  
	  
	  //....... Sorting and Limiting .......
	  
	  System.out.println("\n=== Sorting and limiting ===");
	  
	  //1. Sort students by rank (Ascending)
	  System.out.println("\n Students sorted by rank");
	  List<Student> sorted =
	          students.stream()  
	                  .sorted(Comparator.comparingInt(Student::getRank))
	                  .collect(toList());
	  
	  //2. Sort students by age (Descending)
	  System.out.println("\n Students sorted by age: ");
	  students.stream()
	          .sorted(Comparator.comparingInt(Student::getAge).reversed())
	          .forEach(System.out::println);
	  
	  
	  //3. Top 5 students based on rank
	  System.out.println("\n Top 5 students based on rank: ");
	  students.stream()
	          .limit(5)
	          .forEach(System.out::println);
	  
	  //4. Last 3 students based on rank
	  System.out.println("\n Last 3 students based on rank: ");
	  students.stream()
	          .skip(Math.max(0,  sorted.size() - 3))
	          .forEach(System.out::println);
	  
	  //5. Students sorted by name and then rank
	  System.out.println("\n Students sorted by name and then rank: ");
	  students.stream()
	          .sorted(Comparator.comparing(Student::getName)
	        		  .thenComparing(Student::getRank))
	          .forEach(System.out::println);
	  
	  
	  //....... Grouping and Aggregation .......
	  
	  System.out.println("\n=== Grouping and Aggregation ===");
	  
	  //1. Count students in each department
	  System.out.println("\n Count students in each department: ");
	  System.out.println(
	  students.stream()
	          .collect(groupingBy(Student::getDepartment, counting())));
	  
	  //2. Count students in each city
	  System.out.println("\n Count students in each city: ");
	  System.out.println(
			  students.stream()
			         .collect(groupingBy(Student::getCity, counting())));
	  
	          
	 //3. Average age of students in each department
	  System.out.println("\n Average age of students in each department: ");
	  System.out.println(
			  students.stream()
			          .collect(groupingBy(Student::getDepartment, averagingInt(Student::getAge))));
	  
	  //4. Average rank of students by gender
	  System.out.println("\n Average rank of students by gender: ");
	  System.out.println(
			  students.stream()
			          .collect(groupingBy(Student::getGender, averagingInt(Student::getRank))));
	  //5. Total students in the organization
	  System.out.println("\n Total number of students in the organization: ");
	  System.out.println(students.size());
	  
	  //6. Department with highest average rank
	  System.out.println("\n Department with highest average rank: ");
	  System.out.println(
			  students.stream()
			          .collect(groupingBy(Student::getDepartment, averagingInt(Student::getRank)))
			          .entrySet().stream()
			          .max(Map.Entry.comparingByValue())
      );
	  
			
	  //....... Min/Max/Ranking Problems ....... 
	  
	  System.out.println("\n=== Min/Max/Ranking Problems ===");
	  
	  //1. Student with the best (lowest) rank
	  System.out.println("\n Student with the best (lowest) rank:");
	  System.out.println(sorted.get(0));
	  
	  
	  //2. Student with the worst (highest) rank
	  System.out.println("\n Student with the worst (highest) rank:");
	  System.out.println(sorted.get(sorted.size() - 1 ));
	  
	  
	  //3. Second best rank holder
	  System.out.println("\n Second best rank holder: ");
	  System.out.println(sorted.get(1));
	  
	  
	  //4. Third best rank holder
	  System.out.println("\n Third best rank holder: ");
	  System.out.println(sorted.get(0));
	  
	  
	  //5. Youngest student
	  System.out.println("\n Youngest student: ");
			  students.stream()
			          .min(Comparator.comparingInt(Student::getAge))
			          .ifPresent(System.out::println);
	  
	  
	  //6. Oldest student
	  System.out.println("\n Oldest student: ");
	          students.stream()
	                  .max(Comparator.comparingInt(Student::getAge))
	                  .ifPresent(System.out::println);
	  
	  
	  //....... FlatMap and Collections .......
	  System.out.println("\n=== FlatMap and Collections ===");
	  
	  //1. Contact numbers of all students
	  System.out.println("\n Contact numbers of all students: ");
	  students.stream()
	          .flatMap(s -> s.getContacts().stream())
	          .forEach(System.out::println);
      
	  //2. Count total contact numbers
	  System.out.println("\n Total contact numbbers: " + students.stream()
      .flatMap(s -> s.getContacts().stream())
      .count());
	  
	  
	  //3. Students who have more than one contact number
	  System.out.println("\n Students who have more than one contact number: "); 
	  students.stream()
      .filter(s -> s.getContacts().size() > 1)
      .map(Student::getName)
      .forEach(System.out::println);
	  
	  
	  //4. Unique contact numbers
	  System.out.println("\n Unique contact numbers: ");
	  students.stream()
	          .flatMap(s -> s.getContacts().stream())
	          .distinct()
	          .forEach(System.out::println);
	          
	  
	  //....... Conditional and Matching .......
	  System.out.println("\n=== Conditional and Matching ===");
	  
	  //1. Check if any student belongs to Biotech Engineering
	  System.out.println("\n Student belongs to Biotech engineering: " + students.stream()
      .anyMatch(s -> s.getDepartment().equals("Biotech")));
	  
	  
	  //2. Check if all students are above age 20
	  System.out.println("\n Check if all students are above age 20: " + students.stream()
      .allMatch(s -> s.getAge() > 20));
	  
	  //3. Check if no student belongs to Civil Engineering
	  System.out.println("\n Check if no student belongs to Civil Engineering: " + students.stream()
	  .anyMatch(s -> s.getDepartment().equals("Civil")));
	  
	  
	  //....... Gender-Based Analysis .......
	  System.out.println("\n=== Gender-Based Analysis ===");
	  
	  //1. Count male and female students
	  System.out.println("\n Count male and female students: ");
	  System.out.println(
	  students.stream()
	          .collect(groupingBy(Student::getGender, counting())));
	          
	  //2. Average age of male students
	  System.out.println("\n Average age of male students: ");
	  System.out.println(
			  students.stream()
			          .filter(s -> s.getGender().equals("Male"))
			          .collect(averagingInt(Student::getAge)));
	  
	  
	  //3. Average age of female students
	  System.out.println("\n Average age of female students: ");
	  System.out.println(
			  students.stream()
			          .filter(s -> s.getGender().equals("Female"))
			          .collect(averagingInt(Student::getAge)));
	  
	  //4. Highest ranked male student
	  System.out.println("\n Highest ranked male student: ");
			  students.stream()
			          .filter(s -> s.getGender().equals("Male"))
			          .min(Comparator.comparingInt(Student::getRank))
			          .ifPresent(System.out::println);
	  
			  
	  //5. Highest ranked female student
	  System.out.println("\n Highest ranked male student: ");
			  students.stream()
					  .filter(s -> s.getGender().equals("Female"))
					  .min(Comparator.comparingInt(Student::getRank))
					  .ifPresent(System.out::println);
			  	  
	  //....... Department-Specific Queries .......
	  System.out.println("\n=== Department-Specific Queries ===");
	  
	  //1. Students of all departments 
	  System.out.println("\n Students of all departments with names: ");
	  System.out.println(
			  students.stream()
			          .collect(groupingBy(Student::getDepartment, mapping(Student::getName, toList()))));
	  
	  //2. Youngest student in computer Engineering
	  System.out.println("\n Youngest student in computer Engineering: ");
			  students.stream()
			          .filter(s -> s.getDepartment().equals("Computer"))
			          .min(Comparator.comparingInt(Student::getAge))
			          .ifPresent(System.out::println);
			  
      //3. Top ranked student in Mechanical Engineering
	  System.out.println("\n Top ranked student in Mechanical Engineering: ");
	          students.stream()
	                  .filter(s -> s.getDepartment().equals("Mechanical"))
	                  .min(Comparator.comparingInt(Student::getRank))
	                  .ifPresent(System.out::println);
	          
	  //4. Count students in Electronics Engineering from Karnataka
	  System.out.println("\n Count students in Electronics Engineering from Karnataka: ");
	  System.out.println(
	          students.stream()
	                  .filter(s -> s.getDepartment().equals("Electronics")
	                		  && s.getCity().equals("Karnataka"))
	                  .count()
	  );
	                  
	  
	  //....... Advanced Level .......
	  System.out.println("\n=== Advanced Level ===");
	 
	  //1. Convert student list into a Map<Id, Name>
	  System.out.println("\n Convert student list into a Map<Id, Name>: ");
	  System.out.println(
			  students.stream()
			          .collect(toMap(Student::getId, Student::getName)));
	  
	  //2. Convert the student list into a Map<Department, List<Student>>
	  System.out.println("\n Convert the student list into a Map<Department, List<Student>>: ");
	  System.out.println(
			  students.stream()
			          .collect(groupingBy(Student::getDepartment)));
	  
	  //3. Students whose name starts with ‘S’
	  System.out.println("\n Students whose name starts with ‘S’: ");
			  students.stream()
			          .filter(s -> s.getName().startsWith("S"))
			          .forEach(System.out::println);
	  
	 //4. Students whose name length is greater than 5         
     System.out.println("\n Students whose name length is greater than 5: ");
     students.stream()
             .filter(s -> s.getName().length() > 5)
             .forEach(System.out::println);
     
     //5. Students whose rank is even
     System.out.println("\n Students whose rank is even: ");
     students.stream()
             .filter(s -> s.getRank() % 2 == 0)
             .forEach(System.out::println);
     
     //6. Students whose rank is odd
     System.out.println("\n Students whose rank is odd: ");
     
              students.stream()
                      .filter(s -> s.getRank() % 2 != 0)
                      .forEach(System.out::println);
              
   }
}
