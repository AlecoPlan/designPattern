package com.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author wzy
 * @creats 2020-11-07-17:39
 */
@SuppressWarnings("restriction")
public class JavaProxyTest {
    public static void main(String[] args) {
        JavaProxyInterface javaProxyInterface = new ConcreteClass();
        JavaProxyInterface javaProxyInterface1= (JavaProxyInterface) Proxy.newProxyInstance(JavaProxyTest.class.getClassLoader(), new Class[]{JavaProxyInterface.class}, new MyInvocationHandler(javaProxyInterface));

        javaProxyInterface1.gotoSchool();
        javaProxyInterface1.gotoWork();
        javaProxyInterface1.oneDayFinal();
        javaProxyInterface1.oneDay();

    }
}

/**
 * InvocationHandler的应该实现实际是处理代理的逻辑
 */
class MyInvocationHandler implements InvocationHandler{
    JavaProxyInterface javaProxy;
    public MyInvocationHandler(JavaProxyInterface javaProxy){
        this.javaProxy = javaProxy;
    }

    private void aopMethod(){
        System.out.println("before method");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        aopMethod();
        return method.invoke(javaProxy,args);
    }
}

/**
 * 最顶层接口
 */
interface  JavaProxyInterface{
    void gotoSchool();
    void gotoWork();
    void oneDay();
    void oneDayFinal();
}

class ConcreteClass implements JavaProxyInterface{
    @Override
    public void gotoSchool() {
        System.out.println("gotoSchool");
    }

    @Override
    public void gotoWork() {
        System.out.println("gotoWork");
    }

    @Override
    public void oneDay() {
        gotoSchool();
        gotoWork();
    }

    @Override
    public void oneDayFinal() {
        gotoSchool();
        gotoWork();
    }
}
