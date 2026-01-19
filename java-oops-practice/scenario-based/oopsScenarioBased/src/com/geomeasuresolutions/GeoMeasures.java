package com.geomeasuresolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class GeoMeasures {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Line> lines = new ArrayList<>();

	        System.out.print("Enter number of lines to compare: ");
	        int n = sc.nextInt();

	        //Input multiple lines
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter coordinates for Line " + (i + 1) + " (x1 y1 x2 y2):");
	            double x1 = sc.nextDouble();
	            double y1 = sc.nextDouble();
	            double x2 = sc.nextDouble();
	            double y2 = sc.nextDouble();

	            lines.add(new Line(x1, y1, x2, y2));
	        }

	        //Comparing each pair of lines
	        for (int i = 0; i < lines.size(); i++) {
	            for (int j = i + 1; j < lines.size(); j++) {
	                System.out.println("\nComparing Line " + (i + 1) + " and Line " + (j + 1));
	                LineUtils.compareLines(lines.get(i), lines.get(j));
	            }
	      }
	 }
}

