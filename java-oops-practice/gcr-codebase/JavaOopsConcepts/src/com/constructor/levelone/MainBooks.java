package com.constructor.levelone;

public class MainBooks {
	public static void main(String args []){
	    Books book = new Books("Clean Code", "Robert C. Martin", 500.0, true);
		book.show();
		
		System.out.println();
		
		book.borrowBook();
	}
}
