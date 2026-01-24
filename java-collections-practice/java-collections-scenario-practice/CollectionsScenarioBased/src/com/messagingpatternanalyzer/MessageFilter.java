package com.messagingpatternanalyzer;

public interface MessageFilter<T> {
	
	//Returns true if message true, else false
	boolean allow(T message);

}
