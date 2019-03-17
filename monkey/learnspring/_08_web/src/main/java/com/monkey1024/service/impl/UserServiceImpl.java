package com.monkey1024.service.impl;

import com.monkey1024.service.UserService;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("用户添加");
    }
}
