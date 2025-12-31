package com.inheritance.levelone;

 class Cat extends Animal {
	//Constructor
		Cat (String name, int age){
			super(name, age);
		}
		
		  //Override
		  void makeSound() {
			  System.out.println("Cats meows");
		}

  }
