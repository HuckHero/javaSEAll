package com.zhaoxin.javaAll.javaLearning.Thread.basis;

public class RunnbleThread  implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
