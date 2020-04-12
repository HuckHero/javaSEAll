package com.zhaoxin.javaAll.javaLearning.Thread.saveThread;

public class SynchFunction implements Runnable {
    private int ticket = 100;

    private synchronized void salTicket() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "sale ticket num " + ticket);
            ticket--;
        }
    }

    @Override
    public void run() {
        while (true) {
            salTicket();
        }
    }
}
