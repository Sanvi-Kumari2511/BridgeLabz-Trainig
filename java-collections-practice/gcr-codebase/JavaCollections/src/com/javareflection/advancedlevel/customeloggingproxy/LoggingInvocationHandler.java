package com.javareflection.advancedlevel.customeloggingproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInvocationHandler implements InvocationHandler {

    private Object target;

    //Constructor receives actual object
    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    //This method intercepts all method calls
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //Logging before method execution
        System.out.println("Calling method: " + method.getName());

        //Calling actual method
        return method.invoke(target, args);
    }
}