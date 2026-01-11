package com.emergencypatientnavigation;
//AmbulanceRoute manages hospital units using Circular Linked List

public class AmbulanceRoute {

	    private UnitNode head;   

	    //Adding a new hospital unit
	    public void addUnit(String unitName) {

	        UnitNode newNode = new UnitNode(unitName);

	        //If list is empty
	        if (head == null) {
	            head = newNode;
	            newNode.next = head; 
	            return;
	        }

	        //Traverse to last node
	        UnitNode temp = head;
	        while (temp.next != head) {
	            temp = temp.next;
	        }

	        //Insert at end
	        temp.next = newNode;
	        newNode.next = head;
	    }

	    //Displaying all units in circular path
	    public void displayUnits() {
	        if (head == null) {
	            System.out.println("No hospital units available");
	            return;
	        }

	        System.out.print("\nHospital Route: ");
	        UnitNode temp = head;
	        do {
	            System.out.print(temp.unitName + " → ");
	            temp = temp.next;
	        } 
	        while (temp != head);
	        System.out.println("(Back to Emergency)");
	    }

	    //Finding nearest available unit 
	    public void findAvailableUnit(String startUnit) {

	        if (head == null) {
	            System.out.println("No units available!");
	            return;
	        }

	        UnitNode temp = head;

	        //Moving to starting unit
	        while (!temp.unitName.equals(startUnit)) {
	            temp = temp.next;
	            if (temp == head) {
	                System.out.println("Starting unit not found");
	                return;
	            }
	        }

	        //Rotating through units
	        System.out.println("Searching for available unit");
	        System.out.println("Patient redirected to: " + temp.unitName);
	    }

	    //Removimg a unit if under maintenance
	    public void removeUnit(String unitName) {

	        if (head == null) {
	            System.out.println("No units to remove");
	            return;
	        }

	        UnitNode curr = head;
	        UnitNode prev = null;

	        //Only one node
	        if (head.unitName.equals(unitName) && head.next == head) {
	            head = null;
	            System.out.println(unitName + " removed (Maintenance).");
	            return;
	        }

	        //Traversing circular list
	        do {
	            if (curr.unitName.equals(unitName)) {

	                //If removing head
	                if (curr == head) {
	                    prev = head;
	                    while (prev.next != head) {
	                        prev = prev.next;
	                    }
	                    
	                    head = head.next;
	                    prev.next = head;
	                } 
	                
	                else {
	                    prev.next = curr.next;
	                }

	                System.out.println(unitName + " removed (Maintenance)");
	                return;
	            }

	            prev = curr;
	            curr = curr.next;

	        } 
	        
	        while (curr != head);

	        System.out.println("Unit not found");
	    }
	}

