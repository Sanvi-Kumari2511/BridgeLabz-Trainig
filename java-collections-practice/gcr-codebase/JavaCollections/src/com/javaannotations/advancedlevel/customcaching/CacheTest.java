package com.javaannotations.advancedlevel.customcaching;
public class CacheTest {

    public static void main(String[] args) {

        MathService service = new MathService();

        long start = System.currentTimeMillis();
        System.out.println("Result: " + Cache.invokeWithCache(service, "slowSquare", 3));
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms\n");

        start = System.currentTimeMillis();
        System.out.println("Result: " + Cache.invokeWithCache(service, "slowSquare", 3));
        System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    }
}