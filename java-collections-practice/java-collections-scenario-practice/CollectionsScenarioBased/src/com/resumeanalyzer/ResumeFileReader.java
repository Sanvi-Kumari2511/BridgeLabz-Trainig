package com.resumeanalyzer;
import java.io.*;

public class ResumeFileReader {
	//Reads complete text from a resume file
    static String getText(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        StringBuilder data = new StringBuilder();

        //Read file line by line
        while ((line = reader.readLine()) != null) {
            data.append(line).append(" ");
        }

        reader.close();   
        return data.toString();      
    }
}
