package com.zhaoxin.javaAll.javaLearning.Thread.saveThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable {

    private int ticket = 100;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    System.out.println(Thread.currentThread().getName() + "sale " + ticket);
                    ticket--;
                    lock.unlock();
                }
            }
        }
    }
}
