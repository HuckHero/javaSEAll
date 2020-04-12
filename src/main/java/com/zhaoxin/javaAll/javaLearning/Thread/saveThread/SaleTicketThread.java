package com.zhaoxin.javaAll.javaLearning.Thread.saveThread;

public class SaleTicketThread implements Runnable {
    private int ticket = 100;

    Object object = new Object();


    @Override
    public void run() {
        while (true) {
            //同步代码块中
            synchronized (object) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" sale " + ticket);
                    ticket--;
                }

            }
        }
    }
}
