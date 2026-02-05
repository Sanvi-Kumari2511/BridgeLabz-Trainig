package com.collectors.employeesalarycategorization;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

        //Creating a list of employees with department and salary
        List<Employee> employees = List.of(
                new Employee("Sanvi", "IT", 60000),
                new Employee("Shivani", "HR", 50000),
                new Employee("Sandip", "IT", 80000),
                new Employee("Ashu", "HR", 55000)
        );

        //Group by department and calculate average salary
        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        //Printing result
        avgSalaryByDept.forEach((dept, avg) ->
                System.out.println(dept + " : " + avg));
    }
}