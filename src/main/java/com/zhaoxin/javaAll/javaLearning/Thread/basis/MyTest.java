package com.zhaoxin.javaAll.javaLearning.Thread.basis;

public class MyTest {
    public static void main(String[] args) {
        JiChengThread jiChengThread = new JiChengThread();
        jiChengThread.start();

        RunnbleThread runnbleThread = new RunnbleThread();
        new Thread(runnbleThread).start();
    }
}
