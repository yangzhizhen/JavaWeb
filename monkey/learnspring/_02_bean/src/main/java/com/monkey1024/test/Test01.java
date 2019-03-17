package com.monkey1024.test;

import com.monkey1024.service.StudentService;
import com.monkey1024.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Test01 {


    @Test
    public void newType(){
        //读取spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService studentService = (StudentService) context.getBean("studentService");

        studentService.study();

    }

    @Test
    public void initAndDestroy(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService studentService = (StudentService) context.getBean("studentService");

        studentService.study();

        //将容器关闭
        ((ClassPathXmlApplicationContext)context).close();
    }




}
