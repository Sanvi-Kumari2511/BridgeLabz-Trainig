package com.javareflection.advancedlevel.customobjectmapper;

public class User {
	private int id;
    private String name;
    private String email;

    //Printing result
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
    }
}
