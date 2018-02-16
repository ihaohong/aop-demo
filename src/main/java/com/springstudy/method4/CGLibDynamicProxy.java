package com.springstudy.method4;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author haohong
 */
public class CGLibDynamicProxy implements MethodInterceptor {
    private long begin;

    private static CGLibDynamicProxy instance = new CGLibDynamicProxy();

    private CGLibDynamicProxy() {

    }

    public static CGLibDynamicProxy getInstance() {
        return instance;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }

    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        Object object = proxy.invokeSuper(target, args);
        after();

        return object;
    }

    public void before() {
        begin = System.currentTimeMillis();
    }

    public void after() {
        long end = System.currentTimeMillis();
        System.out.println("execute time: " + (end - begin) + " milli seconds");
    }
}
