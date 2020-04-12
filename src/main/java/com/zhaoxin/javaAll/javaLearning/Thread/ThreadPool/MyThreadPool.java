package com.zhaoxin.javaAll.javaLearning.Thread.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyThreadImpl());
        executorService.submit(new MyThreadImpl());
        executorService.submit(new MyThreadImpl());
        executorService.shutdown();
    }
}
