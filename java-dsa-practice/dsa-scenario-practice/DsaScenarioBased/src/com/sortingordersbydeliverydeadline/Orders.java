package com.sortingordersbydeliverydeadline;

public class Orders {
    String name;
    int deadline;
    
    //Constructor to initialize
    Orders(String name, int deadline){
    	this.name=name;
    	this.deadline=deadline;
    }
     
    //This method converts the Orders object into a readable string
    public String toString() {
        return name + " → Day " + deadline;
    }
}
