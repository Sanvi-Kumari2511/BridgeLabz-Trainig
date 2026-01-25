package com.javaannotations.advancedlevel.customcaching;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Cache {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object invokeWithCache(Object obj, String methodName, Object... args) {

        try {
            Class<?> clazz = obj.getClass();

            Method method = clazz.getMethod(methodName, int.class);

            //Check if method has @CacheResult
            if (method.isAnnotationPresent(CacheResult.class)) {

                String cacheKey = methodName + "_" + args[0];

                //Return cached value if present
                if (cache.containsKey(cacheKey)) {
                    System.out.println("Returning cached result for: " + args[0]);
                    return cache.get(cacheKey);
                }

                //Execute method and cache result
                Object result = method.invoke(obj, args);
                cache.put(cacheKey, result);
                return result;
            }

            //Normal execution if annotation is not present
            return method.invoke(obj, args);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}