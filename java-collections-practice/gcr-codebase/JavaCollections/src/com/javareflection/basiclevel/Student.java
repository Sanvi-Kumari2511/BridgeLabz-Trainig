package com.javareflection.basiclevel;

public class Student {
	private String name;
    private int age;

    //Constructor to initialize Studebt's details
    public Student() {
        this.name = "Sanvi";
        this.age = 21;
    }

    //Method to display Student's information
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
