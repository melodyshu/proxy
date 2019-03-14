package com.proxy.staticproxy;

/**
 * 静态代理
 * 优点：可以做到不对目标对象进行修改的前提下，对目标对象进行功能的扩展和拦截。
 *
 * 缺点：因为代理对象，需要实现与目标对象一样的接口，
 * 会导致代理类十分繁多，不易维护，同时一旦接口增加方法，则目标对象和代理类都需要维护。
 */
public class BussinessProxy implements IBussiness {
    private IBussiness bussiness;

    public BussinessProxy(IBussiness bussiness) {
        this.bussiness = bussiness;
    }

    @Override
    public void execute() {
        System.out.println("前拦截...");
        bussiness.execute();
        System.out.println("后拦截...");
    }
}
