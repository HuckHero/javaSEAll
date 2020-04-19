package com.zhaoxin.javaAll.javaLearning.ClassLoad;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Human {
    String getBelief();

    void eat(String food);
}

//被代理类
class SuperMan implements Human {

    @Override
    public String getBelief() {
        return "I belive can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃香蕉");
    }
}

class ProxyFactory {
    //调用此方法，返回一个代理类的对象
    public static Object getInstance(Object object) {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.bind(object);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), myInvocationHandler);
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Object obj;

    public void bind(Object obj) {
        this.obj = obj;
    }

    //当我们通过代理类的对象，调用方法a时，就会自动的调用如下方法invoke()
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //将被代理类的执行方法A的功能就声明在这
        return method.invoke(obj, args);
    }
}

public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        Human instance = (Human) ProxyFactory.getInstance(superMan);
        instance.eat("ff");
        String belief = instance.getBelief();
        System.out.println(belief);
    }

}
