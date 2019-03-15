package com.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(HelloService.class);
        enhancer.setCallback(new HelloCGLibProxy());
        Object object= enhancer.create();
        HelloService helloService= (HelloService) object;
        helloService.sayHello("hehehe");
    }
}
