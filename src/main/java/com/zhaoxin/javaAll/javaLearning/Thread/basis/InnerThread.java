package com.zhaoxin.javaAll.javaLearning.Thread.basis;

public class InnerThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();
    }
}
