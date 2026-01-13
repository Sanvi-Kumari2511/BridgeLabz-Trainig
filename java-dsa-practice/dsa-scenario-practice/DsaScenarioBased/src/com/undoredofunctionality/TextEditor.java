package com.undoredofunctionality;
import java.util.Stack;

//Text editor with Undo/Redo functionality
public class TextEditor {
	
	    private StringBuilder content;    
	    private Stack<Action> undoStack;   
	    private Stack<Action> redoStack;   

	    //Constructor
	    public TextEditor() {
	        content = new StringBuilder();
	        undoStack = new Stack<>();
	        redoStack = new Stack<>();
	    }

	    //Insert text at a given position
	    public void insert(String text, int position) {
	        if (position < 0 || position > content.length()) {
	        	
	            System.out.println("Invalid position!");
	            return;
	        }
	        
	        content.insert(position, text);
	        undoStack.push(new Action(Action.ActionType.INSERT, text, position));
	        
	        redoStack.clear(); 
	        System.out.println("Inserted: '" + text + "' at " + position);
	    }

	    //Deleting text from a given position with length
	    public void delete(int position, int length) {
	        if (position < 0 || position + length > content.length()) {
	        	
	            System.out.println("Invalid position or length!");
	            return;
	        }
	        
	        String removed = content.substring(position, position + length);
	        
	        content.delete(position, position + length);
	        
	        undoStack.push(new Action(Action.ActionType.DELETE, removed, position));
	        
	        redoStack.clear(); 
	        System.out.println("Deleted: '" + removed + "' from " + position);
	    }

	    //Undo last action
	    public void undo() {
	        if (undoStack.isEmpty()) {
	            System.out.println("Nothing to undo.");
	            return;
	        }
	        
	        Action action = undoStack.pop();
	        if (action.getType() == Action.ActionType.INSERT) {
	        	
	            //Undo insert by deleting
	            content.delete(action.getPosition(), action.getPosition() + action.getText().length());
	        } 
	        
	        else {
	            //Undo delete by reinserting
	            content.insert(action.getPosition(), action.getText());
	        }
	        
	        redoStack.push(action);
	        System.out.println("Undo: " + action);
	    }

	    //Redo last undone action
	    public void redo() {
	        if (redoStack.isEmpty()) {
	        	
	            System.out.println("Nothing to redo.");
	            return;
	        }
	        
	        Action action = redoStack.pop();
	        if (action.getType() == Action.ActionType.INSERT) {
	        	
	            content.insert(action.getPosition(), action.getText());
	        } 
	        
	        else {
	            content.delete(action.getPosition(), action.getPosition() + action.getText().length());
	        }
	        
	        undoStack.push(action);
	        System.out.println("Redo: " + action);
	    }

	    //Showing current content
	    public void display() {
	        System.out.println("Current content: \"" + content + "\"");
	    }
}


