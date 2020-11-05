package com.Observer;

/**
 * @author wzy
 * @creats 2020-11-05-17:08
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2收到");
    }
}
