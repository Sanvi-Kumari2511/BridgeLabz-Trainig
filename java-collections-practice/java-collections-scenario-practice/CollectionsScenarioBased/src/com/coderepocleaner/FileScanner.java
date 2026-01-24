package com.coderepocleaner;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileScanner {
	
	//Recursively scan all .java files
    public static List<Path> scanJavaFiles(String folderPath) throws IOException {
        try (Stream<Path> paths = Files.walk(Paths.get(folderPath))) {
            return paths
                    .filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".java"))
                    .collect(Collectors.toList());
        }
    }

    //Filter files by size 
    public static List<Path> filterBySize(List<Path> files, long minSize) {
        return files.stream().filter(f -> {
                    try { 
                    	
                    	return Files.size(f) >= minSize; 
                    	
                    }
                    catch (IOException e) { 
                    	
                    	return false; 
                    	
                    }
                }).collect(Collectors.toList());
    }

    //Filter files by last modified date
    public static List<Path> filterByModifiedDate(List<Path> files, long afterTimestamp) {
        return files.stream().filter(f -> {
                    try { 
                    	return Files.getLastModifiedTime(f).toMillis() >= afterTimestamp; 
                    	}
                    
                    catch (IOException e) {
                    	return false; 
                    	}
                }).collect(Collectors.toList());
    }
}
