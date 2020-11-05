package com.proxy;

import sun.corba.Bridge;

/**
 * @author wzy
 * @creats 2020-11-05-23:56
 */
public class BirdTimeProxy implements Flyable{
    private Flyable flyable;

    public BirdTimeProxy(Flyable flyable){
        this.flyable = flyable;
    }


    @Override
    public void fly() {
        long start = System.currentTimeMillis();
        flyable.fly();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
