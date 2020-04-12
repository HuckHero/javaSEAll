package com.zhaoxin.javaAll.javaLearning.Thread.basis;

public class JiChengThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
