package com.wayhome.srpingbootmybatis;

import com.wayhome.srpingbootmybatis.entity.TestIn;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SrpingbootMybatisApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void cloneTestIn() throws Exception{
        TestIn testIn = new TestIn();
        TestIn clone = testIn.clone();
        System.out.println(testIn == clone);
    }
}
