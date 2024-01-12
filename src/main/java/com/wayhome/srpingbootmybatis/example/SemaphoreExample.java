package com.wayhome.srpingbootmybatis.example;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreExample {
    public static void main(String[] args) {
        CarPark carPark = new CarPark(4);

        for (int i = 1; i <=7 ; i++) {
            new Thread(carPark::parking,"线程---"+ i).start();
        }
    }
}


class CarPark {

    /**
     * 有4个车位
     */
    private Integer parkingSpaces;

    private Semaphore semaphore;

    public CarPark(Integer parkingSpaces){
        if (parkingSpaces == null){
            parkingSpaces = 1;
        }
        this.parkingSpaces = parkingSpaces;
        semaphore= new Semaphore(parkingSpaces);
    }

    //停车方法
    public void parking() {
        int parkingTime = (int) (Math.random() * 10 + 1);
        String threadName = Thread.currentThread().getName();
        try {
            semaphore.acquire();
            System.out.println(threadName + "  进入车位，停车中。。。");
            System.out.println();
            TimeUnit.SECONDS.sleep(parkingTime);
            System.out.println(threadName +"---------------离开车位, 共停车" +parkingTime + " 小时" );
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }

}