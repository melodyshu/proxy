package com.proxy.jdkproxy;

public class BmwCar implements ICar {
    @Override
    public void drive(String brand) {
        System.out.println("汽车品牌:"+brand);
    }
}
