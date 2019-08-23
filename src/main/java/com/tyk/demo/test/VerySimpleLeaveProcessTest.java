package com.tyk.demo.test;

import com.tyk.demo.DemoApplication;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.FileInputStream;

/**
 * @Author: tyk
 * @Date: 2019/8/23 16:31
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class VerySimpleLeaveProcessTest {
    @Test
    public void testStartProcess() {
        //创建流程引擎
        ProcessEngine processEngine = ProcessEngineConfiguration
                .createStandaloneProcessEngineConfiguration()
                .buildProcessEngine();

        RepositoryService repositoryService = processEngine.getRepositoryService();
        String bpmnFileName = "/diagram/leaveProcess.bpmn";
//        repositoryService.createDeployment()
//                .addInputStream("sayHelloToLeave", new FileInputStream(bpmnFileName));
        //部署

        //验证

        //启动流程
    }
}
