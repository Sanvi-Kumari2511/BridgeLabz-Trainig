package com.javaannotations.advancedlevel.customserialization;

public class User {

    @JsonField(name = "user name")
    private String username;

    @JsonField(name = "user age")
    private int age;

    @JsonField(name = "email id")
    private String email;

    //Constructor to initialize user details
    public User(String username, int age, String email) {
        this.username = username;
        this.age = age;
        this.email = email;
    }
}