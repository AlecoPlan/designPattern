package com.Observer;

/**
 * @author wzy
 * @creats 2020-11-05-17:11
 */
public interface Subject {

    /**
     * 添加观察者
     * @param observer
     */
    public void add(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    public void del(Observer observer);

    /**
     * 通知所有的观察者
     */
    public void notifyObservers();

    /**
     * 自身的操作
     */
    public void operation();
}
