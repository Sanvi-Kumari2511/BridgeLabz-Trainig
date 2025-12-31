package com.inheritance.leveltwo;

class Author extends Book {
    String name;
    String bio;
    Author (String title, int publicationYear, String name, String bio){
    	    super (title, publicationYear);
    	    this.name = name; this.bio = bio;
    	
    }
    
    //Override
    void displayInfo() {
    	 System.out.println("Name of the book: " + name);
    	 System.out.println("Bio of the book: " + bio);
    	 
    }

}
