package com.csvdatahandling.readandprintdata;

// Class to store student data
public class Student {
    int id;
    String name;
    int age;
    int marks;

    // Constructor
    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method to display student info
    public void show() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}
