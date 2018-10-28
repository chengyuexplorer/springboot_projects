package com.yc.config;

import com.yc.config.beans.PersonPropertyResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot的单元测试
 * 可以以类似编码的形式进行自动注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    PersonPropertyResource personPropertyResource;
    /**
     * 将Spring容器注入
     */
    @Autowired
    ApplicationContext ac;
    @Test
    public void testSomeService(){
        System.out.println(ac.containsBean("someService"));
    }
    @Test
    public void contextLoads() {
        System.out.println(personPropertyResource);
    }

}
