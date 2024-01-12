package com.wayhome.srpingbootmybatis.task;

import com.wayhome.srpingbootmybatis.config.SpringUtilConfig;
import com.wayhome.srpingbootmybatis.service.TestInService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

@Component
public class TestInQueryTask extends RecursiveTask<Object> {

    private static final int THRESHOLD = 800;
    private final List<Long> randomIds;
    private final int randomIdSize;
    private final List<String> list;
    private final TestInService testInService;

    public TestInQueryTask(List<Long> randomIds, List<String> list) {
        this.randomIds = randomIds;
        this.randomIdSize = randomIds.size();
        this.list = list;
        this.testInService = SpringUtilConfig.getBean(TestInService.class);
    }

    @Override
    protected List<Long> compute() {
        if (randomIdSize <= THRESHOLD) {
            List<String> nameListByIds = testInService.getNameListByIds(randomIds);
            list.addAll(nameListByIds);
        } else {
            List<List<Long>> lists = averageAssign(randomIds, 2);
            List<Long> steep1 = lists.get(0);
            List<Long> steep2 = lists.get(1);
            TestInQueryTask queryTask1 = new TestInQueryTask(steep1, list);
            TestInQueryTask queryTask2 = new TestInQueryTask(steep2, list);
            invokeAll(queryTask1, queryTask2);
        }
        return null;
    }

    /**
     * 将一组数据平均分成n组
     *
     * @param source 要分组的数据源
     * @param n      平均分成n组
     * @param <T>
     * @return
     */
    public static <T> List<List<T>> averageAssign(List<T> source, int n) {
        List<List<T>> result = new ArrayList<>();
        int remainder = source.size() % n;  //(先计算出余数)
        int number = source.size() / n;  //然后是商
        int offset = 0;//偏移量
        for (int i = 0; i < n; i++) {
            List<T> value;
            if (remainder > 0) {
                value = source.subList(i * number + offset, (i + 1) * number + offset + 1);
                remainder--;
                offset++;
            } else {
                value = source.subList(i * number + offset, (i + 1) * number + offset);
            }
            result.add(value);
        }
        return result;
    }

}

