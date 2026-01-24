package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class CodeRepoCleanerApp {
	public static void main(String[] args) throws IOException {

        String folderPath = "D:\\testing\\Java Programming Workspace\\java-collections-practice\\java-collections-scenario-practice\\CollectionsScenarioBased\\src\\codebase"; 

        List<Path> javaFiles = FileScanner.scanJavaFiles(folderPath);

        //Map category -> files
        Map<String, List<FileData>> categorized = new HashMap<>();
        categorized.put("Valid", new ArrayList<>());
        categorized.put("Warnings", new ArrayList<>());
        categorized.put("Errors", new ArrayList<>());

        for (Path file : javaFiles) {
        	
            FileData data = FileAnalyzer.analyzeFile(file);
            
            if (data.issues.isEmpty()) {
                categorized.get("Valid").add(data);
                
            } 
            
            else if (data.issues.size() <= 2) {
                categorized.get("Warnings").add(data);
                
            } 
            
            else {
                categorized.get("Errors").add(data);
            }
        }

        //Print categorized results
        categorized.forEach((category, files) -> {
            System.out.println("\n--- " + category + " ---");
            
            files.forEach(f -> {
                System.out.println(f.path);
                
                f.issues.forEach(issue -> System.out.println("  " + issue));
            });
        });
    }
}
