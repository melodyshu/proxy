package com.proxy.staticproxy;

public class Main {
    public static void main(String[] args) {
        BussinessProxy bussinessProxy=new BussinessProxy(new Bussiness());
        bussinessProxy.execute();
    }
}
