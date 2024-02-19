package com.wayhome.srpingbootmybatis;

import com.wayhome.srpingbootmybatis.entity.TestIn;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SrpingbootMybatisApplicationTests {

    private final String EXAMINEE_PWD_SALT = "k!s#m@S$5622o9l1t";

    @Test
    void contextLoads() {
    }

    @Test
    public void cloneTestIn() throws Exception{
        TestIn testIn = new TestIn();
        TestIn clone = testIn.clone();
        System.out.println(testIn == clone);
    }

    @Test
    public void desc(){
        String s = DigestUtils.md5DigestAsHex(("ylbzj00823" + EXAMINEE_PWD_SALT).getBytes());
        System.out.println(s);
    }

    @Test
    public void desc1(){
        String s = DigestUtils.md5DigestAsHex(("ybj" + EXAMINEE_PWD_SALT).getBytes());
        System.out.println(s);
    }
}
