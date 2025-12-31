package com.inheritance.levelone;

class Birds extends Animal {
	//Constructor
		Birds (String name, int age){
			super(name, age);
		}
		
		  //Override
		  void makeSound() {
			  System.out.println("Birds chirp");
		}

  }
