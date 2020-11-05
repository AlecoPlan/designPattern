package com.proxy;


import java.util.Random;

interface Flyable{
    void fly();
}
/**
 * @author wzy
 * @creats 2020-11-05-23:48
 */
public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird is flying");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


