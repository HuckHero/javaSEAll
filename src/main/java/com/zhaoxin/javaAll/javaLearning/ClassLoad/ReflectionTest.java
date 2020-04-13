package com.zhaoxin.javaAll.javaLearning.ClassLoad;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException, ClassNotFoundException {
        Class clazz2=Class.forName("com.zhaoxin.javaAll.javaLearning.ClassLoad.Person");
        Class clazz = Person.class;
        Constructor constructor=clazz.getConstructor(String.class,int.class);
        Object obj=constructor.newInstance("zhaoxin",19);
        Person p = (Person) obj;
        System.out.println(obj);

        //调用指定的属性
        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());

        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        //反射可以调用私有属性和方法
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p2 = (Person) cons1.newInstance("huck");
        System.out.println(p2);

        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p2,"高圆圆");
        System.out.println(p2.toString());

        Method showname = clazz.getDeclaredMethod("showname",String.class);
        showname.setAccessible(true);
        String zhaoritian = (String) showname.invoke(p2, "zhaoritian");
        System.out.println(p2.toString());
        System.out.println(zhaoritian);
    }
}
