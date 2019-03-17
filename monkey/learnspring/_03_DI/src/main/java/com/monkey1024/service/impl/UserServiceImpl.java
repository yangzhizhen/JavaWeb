package com.monkey1024.service.impl;

import com.monkey1024.dao.UserDao;
import com.monkey1024.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //通过set方法进行注入
//    public UserDao getUserDao() {
//        return userDao;
//    }
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }


    //通过构造方法进行注入
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {

        //以前需要手动创建对象
        //userDao = new UserDaoImpl();
        userDao.addUser();
    }


}
