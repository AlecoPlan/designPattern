package com.Observer;

/**
 * @author wzy
 * @creats 2020-11-05-17:19
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("主对象的状态发生了改变");
        notifyObservers();
    }
}
