package com.tyk.demo.test;

import com.tyk.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: tyk
 * @Date: 2019/5/17 11:00
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=DemoApplication.class)
public class TestTemplate {
    @Test
    public void findByName() {
//        User user = userService.findByName("admin");
    }
}
