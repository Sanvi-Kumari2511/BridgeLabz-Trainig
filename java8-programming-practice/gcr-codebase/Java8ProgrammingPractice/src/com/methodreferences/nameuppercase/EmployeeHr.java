package com.methodreferences.nameuppercase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeHr {
	public static void main(String[] args) {

        //Creating a list for employee names
        List<String> employees = Arrays.asList("Sanvi", "Ashu", "Shiavni", "Sandip");

        //Converting all names to uppercase using method reference
        List<String> upperCaseNames = employees.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());

        //Printing the result
        System.out.println("Employee Names in Uppercase:");
        upperCaseNames.forEach(System.out::println);
    }
}
