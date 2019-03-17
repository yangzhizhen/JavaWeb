package com.monkey1024.factory;

import com.monkey1024.service.StudentService;
import com.monkey1024.service.impl.StudentServiceImpl;

/**
 * 静态工厂
 */
public class MyBeanStaticFactory {

    public static StudentService createStudentService() {
        return new StudentServiceImpl();
    }
}
