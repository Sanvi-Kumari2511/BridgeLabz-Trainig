package com.undoredofunctionality;

public class MainTextEditor {

	    public static void main(String[] args) {
	    	
	        TextEditor editor = new TextEditor();
	        
	        //Inserting operations
	        editor.insert("Hello", 0);     
	        editor.insert("World", 5);     
	        editor.display();

	        //Deleting operation
	        editor.delete(5, 6);           
	        editor.display();          

	        //Undo operations
	        System.out.println("\nPerforming undo operations:");
	        editor.undo();                  
	        editor.display();

	        editor.undo();                  
	        editor.display();

	        //Redo operations
	        System.out.println("\nPerforming redo operations:");
	        editor.redo();                  
	        editor.display();

	        editor.redo();                  
	        editor.display();
	    }
}

