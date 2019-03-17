package com.monkey1024.service.impl;

import com.monkey1024.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void study() {
        System.out.println("好好学习，天天向上");
    }

    public StudentServiceImpl() {
        System.out.println("studentService构造方法的执行");
    }
}
