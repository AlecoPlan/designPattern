package com.proxy;

/**
 * @author wzy
 * @creats 2020-11-05-23:54
 */
public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        BirdTimeProxy p1 = new BirdTimeProxy(bird);
        BirdLogProxy p2 = new BirdLogProxy(p1);
        p2.fly();
    }
}
