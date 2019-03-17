package com.monkey1024.service.impl;

import com.monkey1024.service.UserService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserServiceImpl implements UserService {
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,rollbackFor = NullPointerException.class)
    @Override
    public void addUser() {
        System.out.println("用户添加");
    }
}
