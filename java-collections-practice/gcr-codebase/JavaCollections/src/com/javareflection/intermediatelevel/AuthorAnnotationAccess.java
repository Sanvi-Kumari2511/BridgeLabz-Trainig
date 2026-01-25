package com.javareflection.intermediatelevel;

public class AuthorAnnotationAccess {
	 public static void main(String[] args) {

	        try {
	            //Load the class using reflection
	            Class<?> clazz = Class.forName("com.javareflection.intermediatelevel.Book");

	            //Check if Author annotation is present
	            if (clazz.isAnnotationPresent(Author.class)) {

	                //Get annotation instance
	                Author author = clazz.getAnnotation(Author.class);

	                //Displaying annotation value
	                System.out.println("Author Name: " + author.name());
	            }

	        } 
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
