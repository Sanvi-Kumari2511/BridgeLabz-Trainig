package com.inheritance.leveltwo;

public class MainPerson {
	    public static void main(String[] args) {

	        Person t = new Teacher("Sanvi", 90, "Mathematics");
	        Person s = new Student("Sandip", 95, "5th Grade");
	        Person st = new Staff("Ram", 55, "Administration");

	        ((Teacher) t).displayRole();
	        System.out.println();

	        ((Student) s).displayRole();
	        System.out.println();

	        ((Staff) st).displayRole();
	    }
	}

