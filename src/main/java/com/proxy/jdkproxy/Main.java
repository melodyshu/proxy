package com.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        ICar audi=new AudiCar();
        ICar car= (ICar) new CarHandler().getInstance(audi);
        car.drive("奥迪");
        ICar baoma=new BmwCar();
        car= (ICar) new CarHandler().getInstance(baoma);
        car.drive("宝马");
    }
}
