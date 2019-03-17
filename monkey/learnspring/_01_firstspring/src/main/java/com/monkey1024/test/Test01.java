package com.monkey1024.test;

import com.monkey1024.service.StudentService;
import com.monkey1024.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Test01 {

    /**
     * 以前的写法，手动创建对象
     */
    @Test
    public void oldType(){
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.study();
    }

    @Test
    public void newType(){
        //读取spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService studentService = (StudentService) context.getBean("studentService");

        studentService.study();
    }


    @Test
    public void beanFactory() {

        //该方式已经被废弃
        //BeanFactory xmlBeanDefinitionReader = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new FileSystemResource("F:\\monkey1024\\learnspring\\_01_firstspring\\src\\main\\resources\\applicationContext.xml"));
        //当时用该bean的时候才会创建对象
        StudentService studentService = (StudentService) factory.getBean("studentService");
    }
}
