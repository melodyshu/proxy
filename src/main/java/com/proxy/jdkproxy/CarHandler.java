package com.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CarHandler implements InvocationHandler {
    private ICar car;

    public Object getInstance(ICar car){
        this.car=car;
        return Proxy.newProxyInstance(ICar.class.getClassLoader(),car.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前拦截...");
        Object object=method.invoke(car,args);
        System.out.println("后拦截...");
        return object;
    }
}
