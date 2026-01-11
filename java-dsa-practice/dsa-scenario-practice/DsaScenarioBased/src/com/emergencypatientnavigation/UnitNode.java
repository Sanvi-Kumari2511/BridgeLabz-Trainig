package com.emergencypatientnavigation;

//Node class representing a hospital unit in circular linked list
public class UnitNode {
	
	    String unitName;     
	    UnitNode next;       

	    //Constructor
	    public UnitNode(String unitName) {
	        this.unitName = unitName;
	        this.next = null;
	    }
}

