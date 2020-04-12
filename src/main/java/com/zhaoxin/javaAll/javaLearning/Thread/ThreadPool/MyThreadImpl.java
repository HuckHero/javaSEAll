package com.zhaoxin.javaAll.javaLearning.Thread.ThreadPool;

public class MyThreadImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
