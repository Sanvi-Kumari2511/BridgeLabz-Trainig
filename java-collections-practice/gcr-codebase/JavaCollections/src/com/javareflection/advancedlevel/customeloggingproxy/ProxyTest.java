package com.javareflection.advancedlevel.customeloggingproxy;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {

        //Original object
        Greeting greeting = new GreetingImpl();

        //Create proxy instance
        Greeting proxyGreeting = (Greeting) Proxy.newProxyInstance(
                greeting.getClass().getClassLoader(),
                greeting.getClass().getInterfaces(),
                new LoggingInvocationHandler(greeting)
        );

        //Method call intercepted by proxy
        proxyGreeting.sayHello("Sanvi");
    }
}