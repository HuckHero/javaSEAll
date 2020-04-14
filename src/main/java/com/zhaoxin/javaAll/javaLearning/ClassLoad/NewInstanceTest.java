package com.zhaoxin.javaAll.javaLearning.ClassLoad;

/**
 * 通过反射创建对应的运行时类的对象
 */
public class NewInstanceTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class clazz = Person.class;
        Object o = clazz.newInstance();
        System.out.println(o);
    }
}
