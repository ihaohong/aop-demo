package com.springstudy.method3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author haohong
 */
public class JDKDynamicProxy implements InvocationHandler {
    private Object target;
    private long begin;

    public JDKDynamicProxy(Object target) {
        this.target = target;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();

        return result;
    }

    public void before() {
        begin = System.currentTimeMillis();
    }

    public void after() {
        long end = System.currentTimeMillis();
        System.out.println("execute time: " + (end - begin) + " milli seconds");
    }
}
