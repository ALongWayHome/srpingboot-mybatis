package com.wayhome.srpingbootmybatis.example;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {


    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        lockExample.printABC();
    }

    public void printABC(){
        Lock lock = new ReentrantLock();
        Condition conditionA = lock.newCondition();
        Condition conditionB = lock.newCondition();
        Condition conditionC = lock.newCondition();
        new Thread(()->{
            lock.lock();
            try {
                for (int i = 0; i < 10; i ++){
                    System.out.println("A");
                    conditionB.signal();
                    conditionA.await();
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }).start();

        new Thread(()->{
            lock.lock();
            try {
                for (int i = 0; i < 10; i ++){
                    System.out.println("B");
                    conditionC.signal();
                    conditionB.await();
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }).start();

        new Thread(()->{
            lock.lock();
            try {
                for (int i = 0; i < 10; i ++){
                    System.out.println("C");
                    conditionA.signal();
                    conditionC.await();
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }).start();
    }


}
