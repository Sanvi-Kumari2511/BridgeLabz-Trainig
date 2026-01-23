package com.avltree;

public class PatientNode {
    int time;             
    String name;           
    int height;            
    PatientNode left, right;

    //Constructor to initialize patient's details
    PatientNode(int time, String name) {
        this.time = time;
        this.name = name;
        height = 1;        
    }

}
