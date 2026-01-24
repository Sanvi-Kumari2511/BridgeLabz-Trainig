package com.resumeanalyzer;

import java.io.File;
import java.util.List;

public class ResumeAnalyser {
	public static void main(String[] args) {

        //Folder containing resume files
        File folder = new File("D:\\testing\\Java Programming Workspace\\java-collections-practice\\java-collections-scenario-practice\\CollectionsScenarioBased\\src\\resume\\copy");

        //Analyzing resumes
        List<ResumeData> result = ResumeHandler.analyze(folder);

        //Displaying sorted resume data
        for (ResumeData r : result) {
            r.show();
        }
    }
}
