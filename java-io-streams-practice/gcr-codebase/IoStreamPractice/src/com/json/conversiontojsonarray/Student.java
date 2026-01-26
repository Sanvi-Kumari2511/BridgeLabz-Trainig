package com.json.conversiontojsonarray;

public class Student {

    private String name;
    private int age;
    private String email;

    //Constructor to initialize students details
    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    //Method to get name of student
    public String getName() {
        return name;
    }
 
    //Method to get age of student
    public int getAge() {
        return age;
    }

    //Method to get name of student
    public String getEmail() {
        return email;
    }
}
