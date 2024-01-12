package com.wayhome.srpingbootmybatis.example;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

public class ClickNumberExample {

    public static final int threadNum = 50;
    public static final int _1W = 20000;


    public static void main(String[] args) throws InterruptedException {
        ClickNumber clickNumber = new ClickNumber();
        costTimeSynchronized(clickNumber);
        costTimeAtomicLong(clickNumber);
        costTimeLongAdder(clickNumber);
        costTimeLongAccumulator(clickNumber);
    }

    public static void costTimeSynchronized(ClickNumber clickNumber) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= threadNum; i++) {
            new Thread(() -> {
                try {
                    for (int j = 0; j < 10 * _1W; j++) {
                        clickNumber.synchronizedClick();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();

        long endTime = System.currentTimeMillis();
        System.out.println("-----costTime: " + (endTime - startTime) + "毫秒" + "\t" + "by synchronizedClick result:" + clickNumber.clickNumber);

    }


    public static void costTimeAtomicLong(ClickNumber clickNumber) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= threadNum; i++) {
            new Thread(() -> {
                try {
                    for (int j = 0; j < 10 * _1W; j++) {
                        clickNumber.atomicLongClick();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();

        long endTime = System.currentTimeMillis();
        System.out.println("-----costTime: " + (endTime - startTime) + "毫秒" + "\t" + "by atomicLongClick result:" + clickNumber.atomicLong.get());

    }

    public static void costTimeLongAdder(ClickNumber clickNumber) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= threadNum; i++) {
            new Thread(() -> {
                try {
                    for (int j = 0; j < 10 * _1W; j++) {
                        clickNumber.longAdderClick();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();

        long endTime = System.currentTimeMillis();
        System.out.println("-----costTime: " + (endTime - startTime) + "毫秒" + "\t" + "by longAdderClick result:" + clickNumber.longAdder.sum());

    }

    public static void costTimeLongAccumulator(ClickNumber clickNumber) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= threadNum; i++) {
            new Thread(() -> {
                try {
                    for (int j = 0; j < 10 * _1W; j++) {
                        clickNumber.longAccumulatorClick();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();

        long endTime = System.currentTimeMillis();
        System.out.println("-----costTime: " + (endTime - startTime) + "毫秒" + "\t" + "by longAccumulatorClick result:" + clickNumber.longAccumulator.get());

    }
}


class ClickNumber {

    int clickNumber = 0;

    public synchronized void synchronizedClick() {
        clickNumber++;
    }

    AtomicLong atomicLong = new AtomicLong(0);

    public void atomicLongClick() {
        atomicLong.getAndIncrement();
    }

    LongAdder longAdder = new LongAdder();

    public void longAdderClick() {
        longAdder.increment();
    }

    LongAccumulator longAccumulator = new LongAccumulator(Long::sum, 0);

    public void longAccumulatorClick() {
        longAccumulator.accumulate(1);
    }

}