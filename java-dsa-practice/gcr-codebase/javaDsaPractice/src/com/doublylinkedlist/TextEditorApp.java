package com.doublylinkedlist;

public class TextEditorApp {

	    public static void main(String[] args) {

	        TextHistory editor = new TextHistory();

	        editor.addState("Hello");
	        editor.addState("Hello Sanvi");
	        editor.addState("Hello Sanvi!");
	        editor.addState("Hello Sanvi!!");

	        editor.displayCurrentState();

	        editor.undo();
	        editor.displayCurrentState();

	        editor.undo();
	        editor.displayCurrentState();

	        editor.redo();
	        editor.displayCurrentState();

	        editor.addState("Hello Singh Sanvi");
	        editor.displayCurrentState();
	    }
	}


