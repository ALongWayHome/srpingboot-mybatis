package com.wayhome.srpingbootmybatis.manager;

import com.wayhome.srpingbootmybatis.entity.TestIn;
import com.wayhome.srpingbootmybatis.service.TestInService;
import com.wayhome.srpingbootmybatis.task.TestInQueryTask;
import com.wayhome.srpingbootmybatis.utils.ForkJoinPoolUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.Collectors;

@Service
public class TestInManager {

    private final TestInService testInService;

    public TestInManager(TestInService testInService) {
        this.testInService = testInService;
    }

    //mock数据
    public void branchAdd() throws Exception {
        TestIn testIn = new TestIn();
        List<TestIn> testInList = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            TestIn entity = testIn.clone();
            entity.setName("name--" + i);
            testInList.add(entity);
            if (i % 1000 == 0) {
                testInService.saveBatch(testInList, 1000);
                testInList.clear();
            }
        }
    }

    public List<String> queryInProcess() throws Exception {
        List<Long> randomIds = createRandomId();
        System.out.println("randomIds size:" + randomIds.size());
        randomIds = randomIds.stream().distinct().sorted(Long::compareTo).collect(Collectors.toList());
        System.out.println("去重排序后：randomIds size:" + randomIds.size());
        List<String> list = new ArrayList<>();
        TestInQueryTask testInQueryTask = new TestInQueryTask(randomIds, list);
        ForkJoinPool forkJoinPool = ForkJoinPoolUtils.getPool();
        ForkJoinTask<Object> submit = forkJoinPool.submit(testInQueryTask);
        submit.get();
        return list;
    }

    private List<Long> createRandomId() {
        List<Long> list = new ArrayList<>(20000);
        Random random = new Random();
        for (int i = 0; i < 20000; i++) {
            long randomId = random.nextInt(100000);
            list.add(randomId);
        }
        return list;
    }

}
