package com.sortingordersbydeliverydeadline;

public class Orders {
    String name;
    int deadline;
    
    Orders(String name, int deadline){
    	this.name=name;
    	this.deadline=deadline;
    }
    public String toString() {
        return name + " → Day " + deadline;
    }
}
