package com.javaannotations.exercise1;
public class Dog extends Animal {

    //Overriding parent (makeSound) method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}