package com.Observer;

/**
 * @author wzy
 * @creats 2020-11-05-17:07
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("observer1收到");
    }
}
