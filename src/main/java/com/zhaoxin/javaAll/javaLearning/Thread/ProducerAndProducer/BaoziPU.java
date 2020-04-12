package com.zhaoxin.javaAll.javaLearning.Thread.ProducerAndProducer;

public class BaoziPU implements Runnable {

    private BaoZi baoZi;

    private int count = 0;

    public BaoziPU(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        synchronized (baoZi) {
            while (true) {
                if (baoZi.flag == true) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    baoZi.pi = "水晶";
                    baoZi.xian = "牛肉";
                } else {
                    baoZi.pi = "薄皮";
                    baoZi.xian = "三鲜";
                }
                count++;
                System.out.println("包子铺生产了：" + baoZi.pi + baoZi.xian + "包子");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baoZi.flag = true;
                baoZi.notify();
                System.out.println("包子生产好了：" + baoZi.pi + baoZi.xian + ",可以吃了");
            }
        }
    }
}
