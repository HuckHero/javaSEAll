package com.zhaoxin.javaAll.javaLearning.Thread.ProducerAndProducer;

public class ChiHuo implements Runnable {

    private BaoZi baoZi;

    private BaoziPU baoziPU;

    public ChiHuo(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baoZi){
                if (baoZi.flag==false){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货在吃包子了："+baoZi.pi+baoZi.xian);
                baoZi.flag=false;
                baoZi.notify();
                System.out.println("吃货吃饱了");
                System.out.println("--------------------");
            }
        }
    }
}
