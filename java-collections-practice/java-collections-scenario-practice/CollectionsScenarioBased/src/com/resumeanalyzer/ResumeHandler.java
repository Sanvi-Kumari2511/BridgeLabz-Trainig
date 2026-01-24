package com.resumeanalyzer;

import java.io.File;
import java.util.*;
import java.util.regex.*;

public class ResumeHandler {
	//Analyzes all resume files inside a folder
    static List<ResumeData> analyze(File folder) {

        List<ResumeData> list = new ArrayList<>();

        //Check folder exists
        if (folder == null || !folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path");
            return list;
        }

        for (File file : folder.listFiles()) {

            try {
                //Skip files other than .txt
                if (!file.getName().endsWith(".txt")) {
                    continue;
                }

                //Read resume text
                String text = ResumeFileReader.getText(file);

                //Extract email using regex
                Matcher emailM = Pattern
                        .compile("[a-zA-Z0-9._]+@[a-z]+\\.[a-z]+")
                        .matcher(text);

                //If email not found, skip resume
                if (!emailM.find()) {
                    throw new Exception("Invalid resume");
                }

                String email = emailM.group();

                //Extract phone number
                Matcher phoneM = Pattern.compile("\\d{10}").matcher(text);
                String phone = phoneM.find() ? phoneM.group() : "NA";

                //Count matching skills
                int count = 0;
                Matcher skillM = Pattern
                        .compile("Java|Python|Spring", Pattern.CASE_INSENSITIVE)
                        .matcher(text);

                while (skillM.find()) {
                    count++;
                }

                //Store resume data
                list.add(new ResumeData(email, phone, count));

            } catch (Exception e) {
                System.out.println("Skipped: " + file.getName());
            }
        }

        //Sort resumes by skill count (descending order)
        list.sort((a, b) -> b.skillCount - a.skillCount);

        return list;
    }
}