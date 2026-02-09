package com.streams.employee;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class EmployeeMain {
   public static void main(String args []) {
	   
	  List<Employee> employees =  Arrays.asList(
				new Employee(1, "Sanvi", 21, "Female", "IT", 2026, 400000),
				new Employee(2, "Shivani", 22, "Female", "Sales", 2025, 20000),
				new Employee(3, "Sandip", 23, "Male", "Product", 2022, 450000),
				new Employee(4, "Ashu", 20, "Male", "IT", 2020, 340000)
				);
	
	  //1. Count male and female
      System.out.println("1. Gender count: ");
      System.out.println(
    		  employees.stream()
    		            .collect(groupingBy(Employee::getGender, counting()))
      );
      
      
      //2. Department
      System.out.println("\n2. Department: ");
      employees.stream()
               .map(Employee::getDepartment)
               .distinct()
               .forEach(System.out::println);
      
      
     //3. Average age by gender
     System.out.println("\n Average age: ");
     System.out.println(
               employees.stream()   
                       .collect(groupingBy(Employee::getGender,
            		           averagingInt(Employee::getAge)))
     );
     
     //4. Highest paid
     System.out.println("\n Highest paid: ");
     employees.stream() 
              .max(Comparator.comparingDouble(Employee::getSalary))
              .ifPresent(System.out::println);
     
     //5. Get names who joined after 2015
     System.out.println("\n Joined afetr 2015: ");
     employees.stream()
              .filter(e -> e.getYearOfJoining() > 2015)
              .map(Employee::getName)
              .forEach(System.out::println);
     
     //6. Count employees per department
     System.out.println("\n Count by department: ");
     System.out.println(
              employees.stream()
                       .collect(groupingBy(Employee::getDepartment, counting()))
     );
     
     //7. Average salary by department
     System.out.println("\n Average salary by department: ");
     System.out.println(
    		 employees.stream()
    		          .collect(groupingBy(Employee::getDepartment,
    		        		  averagingDouble(Employee::getSalary)))
     );
     
     //8. Youngest male employee in product department
     System.out.println("\n Youngest male in Product department: ");
     employees.stream()
              .filter(e -> e.getGender().equals("Male")
            		  && e.getDepartment().equals("Product"))
              .min(Comparator.comparingInt(Employee::getAge))
              .ifPresent(System.out::println);
     
     //9. Most experienced employee
     System.out.println("\n Most experienced employee in the organization: ");
     employees.stream()
              .min(Comparator.comparingInt(Employee::getYearOfJoining))
              .ifPresent(System.out::println);
     
     //10. Male and Female in Sales
     System.out.println("\n Count of male and female in Sales: ");
     System.out.println(
    		 employees.stream()
    		          .filter(e -> e.getDepartment().equals("Sales"))
    		          .collect(groupingBy(Employee::getGender, counting()))
     );
     
     
     //11. Average salary by gender
     System.out.println("\n Average salary by gender: ");
     System.out.println(
    		 employees.stream()
    		          .collect(groupingBy(Employee::getGender,
    		        		  averagingDouble(Employee::getSalary)))
     );
     
     //12. Employees name by department
     System.out.println("\n Employees per department: ");
     System.out.println(
    		 employees.stream()
    		          .collect(groupingBy(Employee::getDepartment,
    		        		  mapping(Employee::getName, toList())))
     );
     
     //13. Average and total salary of the organization
     System.out.println("\n Average and Total salary: ");
     
    		 DoubleSummaryStatistics stats = 
    		 employees.stream()
    		          .collect(summarizingDouble(Employee::getSalary));
    		          
    		 System.out.println("Average: " + stats.getAverage());
    		 System.out.println("Total: " + stats.getSum());
    		 
    		 
     //14. Employees whose salary is greater than 25k
     System.out.println("\n Salary greater than 25k: ");		 
     employees.stream()
              .filter(e -> e.getSalary() > 25000)
              .forEach(System.out::println);
     
     
     //15. Sort employees by salary
     List<Employee> sorted =
    		   employees.stream()
    		            .sorted(Comparator.comparingDouble(Employee::getSalary))
    		            .collect(Collectors.toList());
     
     //15. Highest paid employee
     System.out.println("\n Highest paid: ");
     System.out.println(sorted.get(sorted.size() - 1));
     
     //16. Second highest paid employee
     System.out.println("\n Second highest paid: ");
     System.out.println(sorted.get(sorted.size() - 2));
     
     //17. Third highest paid employee
     System.out.println("\n Third highest paid: ");
     System.out.println(sorted.get(sorted.size() - 3));
     
     
     //18. Lowest paid employee
     System.out.println("\n Lowest paid: ");
     System.out.println(sorted.get(1));
     
     //19. Second lowest paid employee
     System.out.println("\n Second lowest paid: ");
     System.out.println(sorted.get(2));
     
     //20. Third lowest paid employee
     System.out.println("\n First five lowest paid: ");
     sorted.stream()
           .limit(5)
           .forEach(System.out::println);
     
     //21. First five highest paid employees
     System.out.println("\n First five highest paid: ");
     sorted.stream()
           .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
           .limit(5)
           .forEach(System.out::println);
	   
   }
}
