package com.javaannotations.exercise3;
import java.util.ArrayList;

public class SuppressWarningExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        //Raw ArrayList (without generics)
        ArrayList list = new ArrayList();

        list.add("Java");
        list.add(100);  
        list.add(true);

        //Accessing elements
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}