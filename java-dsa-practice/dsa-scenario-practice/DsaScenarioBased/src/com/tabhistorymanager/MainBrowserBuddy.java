package com.tabhistorymanager;

public class MainBrowserBuddy {
	
	    public static void main(String[] args) {

	        BrowserBuddy tab = new BrowserBuddy();
	        BrowserManager manager = new BrowserManager();

	        // Browsing history
	        tab.visit("google.com");
	        tab.visit("openai.com");
	        tab.visit("github.com");
	        
            System.out.println();
            
	        //Navigation
	        tab.back();
	        tab.back();
	        tab.forward();
	        
	        System.out.println();
	        
	        System.out.println("Current Page: " + tab.getCurrentPage());
	        
	       
	        
	        //Close tab
	        manager.closeTab(tab);
	        
	        //Restore tab
	        BrowserBuddy restoredTab = manager.restoreTab();
	        if (restoredTab != null) {
	            System.out.println("Restored Page: " + restoredTab.getCurrentPage());
	        }
	  }
}

