package com.birdsanctuary;

public class Duck extends Bird implements Swimmable {
   
	public Duck(String id, String name) {
        super(id, name, "Duck");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying low.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Duck | ID: " + getId() + " | Name: " + getName() + " | Fly & Swim");
    }
}