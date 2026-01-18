package com.javacollections.mapinterface;

import java.util.*;

public class GroupByProperty {
	
	    String name;
	    String department;

	    GroupByProperty(String name, String department) {
	        this.name = name;
	        this.department = department;
	    }

	    @Override
	    public String toString() {
	        return name;
	    }
	

	    public static void main(String[] args) {

	        //List of employees
	        List<GroupByProperty> employees = Arrays.asList(
	            new GroupByProperty("Sanvi", "HR"),
	            new GroupByProperty("Shivani", "IT"),
	            new GroupByProperty("Sandip", "HR")
	        );

	        //Map to group employees by department
	        Map<String, List<GroupByProperty>> departmentMap = new HashMap<>();

	        for (GroupByProperty emp : employees) {
	            //Adding employee to the list for their department
	            departmentMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
	        }

	        //Printing the grouped employees
	        for (Map.Entry<String, List<GroupByProperty>> entry : departmentMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
      }
}
