package com.wayhome.srpingbootmybatis.example;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExample {

    public static void main(String[] args) throws Exception{
        case1();
        System.out.println("-----------------------");
        case2();
    }
    //控制线程一起运行，这里用跑步的示例来说明
    //当裁判的发令枪响了之后才能让线程跑起来
    public static void case1() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            final int no = i + 1;
            executorService.execute(() -> {
                System.out.println(no + "号运动员已经准备完毕...");
                try {
                    countDownLatch.await();
                    System.out.println(no + "号运动员跑出去了...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("预备...跑！！");
        countDownLatch.countDown();
        TimeUnit.SECONDS.sleep(1);
        executorService.shutdown();
    }

    //教室的人都走了才能锁门
    public static void case2() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            final int no = i + 1;
            executorService.execute(() -> {
                try {
                    TimeUnit.SECONDS.sleep(random.nextInt(10));
                    System.out.println(no + "号同学走出教室...");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        System.out.println("所有同学都已经走出了教室...锁门");
        executorService.shutdown();
    }
}
