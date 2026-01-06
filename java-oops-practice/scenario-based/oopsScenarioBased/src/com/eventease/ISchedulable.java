package com.eventease;

public interface ISchedulable {
	
	    //Schedule the event
		void schedule();  
		// Reschedule the event
	    void reschedule();   
	    //Cancel the event
	    void cancel();
}
