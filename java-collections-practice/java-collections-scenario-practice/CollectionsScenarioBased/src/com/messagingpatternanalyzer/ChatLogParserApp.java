package com.messagingpatternanalyzer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ChatLogParserApp {
	public static void main(String[] args) {

        try {
        	
            //List of idle chat keywords
            List<String> idleWords = Arrays.asList("lol", "brb");

            //Creating idle chat filter
            MessageFilter<String> filter = new IdleChatFilter(idleWords);
            
            //Parse chat log file
            Map<String, List<String>> result = ChatLogParser.parse("D:\\testing\\Java Programming Workspace\\java-collections-practice\\java-collections-scenario-practice\\CollectionsScenarioBased\\src\\chatlog.txt", filter);

            //Displaying filtered messages 
            result.forEach((user, messages) -> {
                System.out.println("User: " + user);
                
                for (String msg : messages) {
                    System.out.println("  " + msg);
                }
            });

        }
        
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
