package com.tyk.demo.test;

import com.tyk.demo.DemoApplication;
import org.activiti.engine.*;
import org.activiti.engine.repository.Deployment;
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
                .createProcessEngineConfigurationFromResource("activiti.cfg.xml")
                .buildProcessEngine();

//        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //部署
        RepositoryService repositoryService = processEngine.getRepositoryService();
        String bpmnFileName = "diagram/leaveProcess.bpmn";
//        repositoryService.createDeployment()
//                .addInputStream("leaveProcess",
//                        this.getClass().getClassLoader().getResourceAsStream(bpmnFileName))
//                .deploy();

        repositoryService.createDeployment()
                .name("helloWorld")
                .addClasspathResource("diagram/leaveProcess.bpmn")
                .addClasspathResource("diagram/leaveProcess.png")
                .deploy();

//            	  Deployment deployment= processEngine.getRepositoryService()//与流程定义与部署对象相关的service
//                                 .createDeployment()
//                                 .name("HelloWorld入门程序")//创建一个部署对象
//                                 .addClasspathResource("MyLeave.bpmn")//从classpath资源中加载，一次只能加载一个文件
//                                 .addClasspathResource("ActivitiHelloWorld.png")
//                                 .deploy();//完成部署
//             System.out.println("部署ID:"+deployment.getId());
//             System.out.println("部署名字："+deployment.getName());

        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().singleResult();
        System.out.println("流程Key：" + processDefinition.getKey());

        //定义运行时，开启流程实例
        RuntimeService runtimeService = processEngine.getRuntimeService();
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("myProcess");

        System.out.println("pid:" + processInstance.getId() + ",pdid:" + processInstance.getProcessDefinitionId());

        Map<String, String> variables = new HashMap<>();
        variables.put("applyUser", "tyk");
        variables.put("days", "3");
        //启动流程
    }
}
