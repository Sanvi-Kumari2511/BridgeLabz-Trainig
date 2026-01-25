package com.javaannotations.advancedlevel.customcaching;

public class MathService {

    @CacheResult
    public int slowSquare(int number) {

        System.out.println("Computing square for: " + number);

        try {
            Thread.sleep(1500); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return number * number;
    }
}