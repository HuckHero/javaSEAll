package com.zhaoxin.javaAll.javaLearning.Thread.ProducerAndProducer;

public class MyTest {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        Thread baozipu =new Thread(new BaoziPU(baoZi));
        baozipu.start();
        Thread chihuo =new Thread(new ChiHuo(baoZi));
        chihuo.start();
    }
}
