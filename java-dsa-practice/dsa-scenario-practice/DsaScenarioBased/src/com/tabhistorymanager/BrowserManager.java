package com.tabhistorymanager;
import java.util.Stack;

//BrowserManager handles tab closing and restoring
public class BrowserManager {

	    //Stack to store closed tabs
	    private Stack<BrowserBuddy> closedTabs;

	    public BrowserManager() {
	        closedTabs = new Stack<>();
	    }

	    //Close a tab
	    public void closeTab(BrowserBuddy tab) {
	        closedTabs.push(tab);
	        
	        System.out.println("Tab closed.");
	       
	    }

	    //Restore last closed tab
	    public BrowserBuddy restoreTab() {
	    	
	        if (!closedTabs.isEmpty()) {
	        	
	            System.out.println("Tab restored.");
	            
	            return closedTabs.pop();
	        } 
	        else {
	           
	        	System.out.println("No closed tabs to restore.");
	            
	        	return null;
	        }
	    }
}

