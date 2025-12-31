package com.inheritance.levelone;
import java.util.Scanner;

public class MainAnimal {
   public static void main(String args []) {
	   Animal a1 = new Dog("Buddy", 3);
       Animal a2 = new Cat("Kitty", 2);
       Animal a3 = new Birds("Tweety", 1);

       a1.makeSound();
       a2.makeSound();
       a3.makeSound();
	   
   }
}
