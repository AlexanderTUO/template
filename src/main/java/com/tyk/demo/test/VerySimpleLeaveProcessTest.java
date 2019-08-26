package com.tyk.demo.test;

import com.tyk.demo.DemoApplication;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

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

        //部署
        RepositoryService repositoryService = processEngine.getRepositoryService();
        String bpmnFileName = "/diagram/leaveProcess.bpmn";
        repositoryService.createDeployment()
                .addInputStream("sayHelloToLeave",
                        this.getClass().getClassLoader().getResourceAsStream(bpmnFileName))
                .deploy();

        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().singleResult();
        System.out.println("流程Key：" + processDefinition.getKey());

        //定义运行时，开启流程实例
        RuntimeService runtimeService = processEngine.getRuntimeService();
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("sayHelloToLeave");

        System.out.println("pid:" + processInstance.getId() + ",pdid:" + processInstance.getProcessDefinitionId());

        Map<String, String> variables = new HashMap<>();
        variables.put("applyUser", "tyk");
        variables.put("days", "3");
        //启动流程
    }
}
