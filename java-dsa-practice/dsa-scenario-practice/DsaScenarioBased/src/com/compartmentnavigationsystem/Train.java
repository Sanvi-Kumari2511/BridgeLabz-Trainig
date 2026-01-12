package com.compartmentnavigationsystem;

public class Train {
	private Compartment head;
    private Compartment tail;
    
    //Adding compartment at the end
    public void addCompartment(String name, String service) {
    	Compartment newCompartment = new Compartment(name, service);
    	if(head == null) {
    		head = tail = newCompartment;
    	}
    	
    	else {
    		
    		tail.next = newCompartment;
    		newCompartment.previous = tail;
    		tail = newCompartment;
    	}
    	System.out.println("Compartment added: " + newCompartment);
    }
    
 //Removing compartment by name
    public void removeCompartment(String name) {
        Compartment current = head;
        
        while (current != null) {
            if (current.getName().equals(name)) {
            	
                if (current.previous != null) current.previous.next = current.next;
                else head = current.next;

                if (current.next != null) current.next.previous = current.previous;
                else tail = current.previous;

                System.out.println("Removed compartment: " + name);
                return;
            }
            current = current.next;
        }
        System.out.println("Compartment not found: " + name);
    }

    //Traversing forward
    public void traverseForward() {
    	
        System.out.println("Train compartments (forward):");
        Compartment current = head;
        
        while (current != null) {
        	
            System.out.print(current + " <-> ");
            current = current.next;
        }
        System.out.println("END");
    }

    //Traversing backward
    public void traverseBackward() {
    	
        System.out.println("Train compartments (backward):");
        Compartment current = tail;
        
        while (current != null) {
        	
            System.out.print(current + " <-> ");
            current = current.previous;
        }
        System.out.println("START");
    }

    //Displaying adjacent compartments for a given compartment
    public void displayAdjacent(String name) {
    	
        Compartment current = head;
        
        while (current != null) {
        	
            if (current.getName().equals(name)) {
                String prevCompartment = (current.previous != null) ? current.previous.toString() : "None";
                String nextCompartment = (current.next != null) ? current.next.toString() : "None";
                System.out.println("Current: " + current);
                System.out.println("Previous: " + prevCompartment);
                System.out.println("Next: " + nextCompartment);
                return;
            }
            current = current.next;
        }
        System.out.println("Compartment not found: " + name);
    }
    
}

