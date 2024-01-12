package com.wayhome.srpingbootmybatis.utils;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolUtils {

    private static ForkJoinPool forkJoinPool;

    public static ForkJoinPool getPool() {
        if (forkJoinPool == null){
            forkJoinPool = createForkJoinPool();
        }
        return forkJoinPool;
    }

    public static ForkJoinPool createForkJoinPool() {
        return new ForkJoinPool(10, ForkJoinPool.defaultForkJoinWorkerThreadFactory, null, true);
    }
}
