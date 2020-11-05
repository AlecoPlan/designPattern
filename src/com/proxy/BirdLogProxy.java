package com.proxy;

/**
 * @author wzy
 * @creats 2020-11-05-23:56
 */
public class BirdLogProxy implements Flyable{
    private Flyable flyable;

    public BirdLogProxy(Flyable flyable){
        this.flyable = flyable;
    }


    @Override
    public void fly() {
        System.out.println("Bird fly start...");

        flyable.fly();

        System.out.println("Bird fly end...");
    }
}
