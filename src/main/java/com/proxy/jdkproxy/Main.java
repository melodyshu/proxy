package com.proxy.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) throws Exception {
        ICar audi=new AudiCar();
        AudiCar ac=new AudiCar();
        Class[] clazz= ac.getClass().getInterfaces();
        ICar car= (ICar) new CarHandler().getInstance(audi);
        car.drive("奥迪");
        ICar baoma=new BmwCar();
        car= (ICar) new CarHandler().getInstance(baoma);
        byte[] bytes=ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{ICar.class});
        FileOutputStream fileOutputStream=new FileOutputStream("c:\\proxy.class");
        fileOutputStream.write(bytes);
        fileOutputStream.flush();
        fileOutputStream.close();
        car.drive("宝马");
    }
}
