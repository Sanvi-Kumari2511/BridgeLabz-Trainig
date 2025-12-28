package com.constructor.levelone;

public class MainBook {
	public static void main(String args []){
		
		   //Default constructor
		   Book book1 = new Book();
		   book1.show();
		   System.out.println();
		   
		   //Parameterized constructor
		   Book book2 = new Book("Clean Code", "Robert C Martin", 450.0);
		   book2.show();
	}
}	


