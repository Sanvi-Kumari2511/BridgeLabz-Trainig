package com.undoredofunctionality;

//Represents a single editing action (Insert or Delete)
public class Action {

	    //Enum for action type
	    public enum ActionType { 
	    	INSERT, DELETE 
	    	}

	    private ActionType type;   
	    private String text;      
	    private int position;      

	    //Constructor
	    public Action(ActionType type, String text, int position) {
	        this.type = type;
	        this.text = text;
	        this.position = position;
	    }

	    //Getters
	    public ActionType getType() { 
	    	return type; 
	    	}
	    
	    public String getText() { 
	    	return text; 
	    	}
	    
	    public int getPosition() {
	    	return position; 
	    	}

	    //For printing action details (Override)
	   
	    public String toString() {
	        return type + "('" + text + "' at " + position + ")";
	    }
}


