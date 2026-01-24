package com.coderepocleaner;

import java.nio.file.Path;
import java.util.List;

public class FileData {
	Path path;              
    List<String> issues;     
    long size;               
    long lastModified;      

    //Constructor to initialize details of file
    public FileData(Path path, List<String> issues, long size, long lastModified) {
        this.path = path;
        this.issues = issues;
        this.size = size;
        this.lastModified = lastModified;
    }
}
