package com.zhaoxin.javaAll.javaLearning.Thread.saveThread;

public class MyTest {
    public static void main(String[] args) {
        SaleTicketThread saleTicketThread = new SaleTicketThread();
        SynchFunction synchFunction = new SynchFunction();
        LockThread lockThread = new LockThread();
        Thread t1 = new Thread(lockThread);
        Thread t2 = new Thread(lockThread);
        Thread t3 = new Thread(lockThread);
        t1.start();
        t2.start();
        t3.start();
    }
}
