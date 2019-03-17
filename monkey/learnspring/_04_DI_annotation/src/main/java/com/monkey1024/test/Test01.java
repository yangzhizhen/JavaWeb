package com.monkey1024.test;

import com.monkey1024.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void testDI(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser();
    }

    @Test
    public void testInitAndDestroy(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser();
        //关闭容器
        ((ClassPathXmlApplicationContext)context).close();
    }

    @Test
    public void testPrototype(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService1 = (UserService) context.getBean("userService");
        UserService userService2 = (UserService) context.getBean("userService");
        System.out.println(userService1 == userService2);
    }


    public void testFiles(){
        //将spring相关的配置文件的文件名写到Sting类型的数组中
        String[] files = {"applicatonContext.xml", "spring-aop.xml", "spring-bean.xml"};
        ApplicationContext context = new ClassPathXmlApplicationContext(files);
    }
}
