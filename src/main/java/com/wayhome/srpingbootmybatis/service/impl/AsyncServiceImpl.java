package com.wayhome.srpingbootmybatis.service.impl;

import com.wayhome.srpingbootmybatis.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service("asyncService")
public class AsyncServiceImpl implements AsyncService {

    @Override
    @Async("asyncServiceExecutor")
    public void executeAsync() {
        System.out.println("start execute Async...");
        System.out.println("当前线程的名称" + Thread.currentThread().getName());
        System.out.println("end execute Async...");
    }
}