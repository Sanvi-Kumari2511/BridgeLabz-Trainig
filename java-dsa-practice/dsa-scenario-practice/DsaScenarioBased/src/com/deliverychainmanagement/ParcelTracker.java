package com.deliverychainmanagement;

public class ParcelTracker {

	    private StageNode head;   
	    private StageNode tail;  

	    //Constructor: initialize first stage
	    public ParcelTracker(String initialStage) {
	        head = new StageNode(initialStage);
	        tail = head;
	    }

	    
	    //Adds next delivery stage at the end
	    public void addStage(String stageName) {
	        StageNode newNode = new StageNode(stageName);
	        tail.next = newNode;
	        tail = newNode;
	    }

	    
	    //Adds a custom checkpoint after a given stage
	    public void addCheckpointAfter(String existingStage, String newStage) {

	        StageNode current = head;

	        while (current != null) {
	            if (current.stageName.equals(existingStage)) {
	                StageNode checkpoint = new StageNode(newStage);
	                checkpoint.next = current.next;
	                current.next = checkpoint;

	                //Update tail if added at end
	                if (current == tail) {
	                    tail = checkpoint;
	                }
	                
	                return;
	            }
	            
	            current = current.next;
	        }

	        System.out.println("Stage not found: " + existingStage);
	    }

	    
	    //Forward tracking through stages
	    public void trackParcel() {
	        StageNode current = head;

	        System.out.println("Parcel Tracking Status:");

	        while (current != null) {
	        	
	            System.out.print(current.stageName + " → ");
	            current = current.next;
	        }
	        
	        System.out.println("END");
	    }

	    
	    //Handles lost or missing parcel (If next reference is null unexpectedly)
	    public void detectMissingStage() {
	        StageNode current = head;

	        while (current != null) {
	        	
	            if (current.next == null && current != tail) {
	                System.out.println("Parcel lost after stage: " + current.stageName);
	                return;
	            }
	            
	            current = current.next;
	        }
	  }
}
