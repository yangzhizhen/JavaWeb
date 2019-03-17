package com.monkey1024.factory;

import com.monkey1024.service.StudentService;
import com.monkey1024.service.impl.StudentServiceImpl;

/**
 * 实例工厂
 */
public class MyBeanFactory {

    public StudentService createStudentService() {
        return new StudentServiceImpl();
    }
}
