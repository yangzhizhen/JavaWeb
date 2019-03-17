package com.monkey1024.dao.impl;

import com.monkey1024.dao.UserDao;
import com.monkey1024.util.MyLog;
import com.monkey1024.util.MyTransaction;
import org.springframework.stereotype.Repository;

public class UserDaoImpl implements UserDao {

//    @Override
//    public void addUser() {
//
//        //记录日志
//        MyLog.doLog(this.getClass());
//
//        //业务逻辑
//        System.out.println("添加用户");
//
//        //处理事务
//        MyTransaction.doTransaction(this.getClass());
//    }


    @Override
    public void addUser() {

        //业务逻辑
        System.out.println("添加用户");
    }
}
