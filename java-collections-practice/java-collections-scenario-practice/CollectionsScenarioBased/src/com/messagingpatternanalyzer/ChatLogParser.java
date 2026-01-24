package com.messagingpatternanalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChatLogParser {
	
	// Regex pattern
    private static final Pattern CHAT_PATTERN =
            Pattern.compile("\\[(.*?)\\]\\s(.*?):\\s(.*)");

    //Returns user message
    public static Map<String, List<String>> parse(String filePath, MessageFilter<String> filter) throws Exception {

        //TreeMap to sorts users alphabetically
        Map<String, List<String>> userMessages = new TreeMap<>();

        //BufferedReader for reading text file
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        //Reading file line by line
        while ((line = br.readLine()) != null) {

            Matcher matcher = CHAT_PATTERN.matcher(line);

            //Checking condition of line matching
            if (matcher.matches()) {

                String user = matcher.group(2);      
                String message = matcher.group(3); 

                //Skip idle chat messages
                if (!filter.allow(message)) {
                    continue;
                }

                //Store message under corresponding user
                userMessages.computeIfAbsent(user, k -> new ArrayList<>()).add(message);
            }
        }

        br.close(); 
        return userMessages;
    }
}
