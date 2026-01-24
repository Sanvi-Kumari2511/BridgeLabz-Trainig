package com.messagingpatternanalyzer;

import java.util.List;

public class IdleChatFilter implements MessageFilter<String> {
	//List of keywords of idle chat
    private List<String> keywords;

    public IdleChatFilter(List<String> keywords) {
        this.keywords = keywords;
    }

    //Check message contains idle keywords
    @Override
    public boolean allow(String message) {

        String msg = message.toLowerCase();

        for (String word : keywords) {
            if (msg.contains(word)) {
                return false; 
            }
        }
        return true; 
    }
	

}
