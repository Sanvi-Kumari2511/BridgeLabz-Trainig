package com.coderepocleaner;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class FileAnalyzer {
	 //Analyze one file
    public static FileData analyzeFile(Path file) {
        List<String> issues = new ArrayList<>();
        
        try {
            List<String> lines = Files.readAllLines(file);

            //Regex for method naming conventions 
            Pattern methodPattern = Pattern.compile(
                "\\s*(public|private|protected)?\\s+\\w+\\s+([a-z][a-zA-Z0-9]*)\\s*\\(.*\\)\\s*\\{"
            );

            //Regex for unused imports (simplified: imports that are declared but class not used)
            Set<String> imports = new HashSet<>();
            for (String line : lines) {
                line = line.trim();

                //Collect imports
                if (line.startsWith("import ")) {
                    imports.add(line.replace("import ", "").replace(";", ""));
                }

                //Check method names
                Matcher m = methodPattern.matcher(line);
                if (m.find()) {
                    String methodName = m.group(2);
                    
                    if (!Character.isLowerCase(methodName.charAt(0))) {
                        issues.add("Method not camelCase: " + methodName);
                    }
                }
            }

            //Simple unused imports check
            for (String imp : imports) {
                boolean used = false;
                
                for (String line : lines) {
                    if (line.contains(imp.substring(imp.lastIndexOf(".")+1))) {
                        used = true;
                        
                        break;
                    }
                }
                
                if (!used) {
                    issues.add("Unused import: " + imp);
                }
            }

            long size = Files.size(file);
            long modified = Files.getLastModifiedTime(file).toMillis();

            return new FileData(file, issues, size, modified);

        } 
        
        catch (IOException e) {
            issues.add("Error reading file");
            return new FileData(file, issues, 0, 0);
        }
    }
}
