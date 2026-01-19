package com.bagnballorganizer;

public class Ball implements Storable {
	 private String id;
	    private String color;
	    private String size; 

	    //Constructor to initialize ball details
	    public Ball(String id, String color, String size) {
	        this.id = id;
	        this.color = color;
	        this.size = size;
	    }

	    //Getter method to get id
	    public String getId() {
	        return id;
	    }
        
	    //Getter method to get color
	    public String getColor() {
	        return color;
	    }

	    //Getter method to get size
	    public String getSize() {
	        return size;
	    }

	    //Displaying ball info( Override)
	    public void displayInfo() {
	        System.out.println("Ball[ID=" + id + ", Color=" + color + ", Size=" + size + "]");
	    }
}
