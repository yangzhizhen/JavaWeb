package com.monkey1024.test;


import com.monkey1024.dao.UserDao;
import com.monkey1024.dao.impl.UserDaoImpl;
import com.monkey1024.proxy.MyInvocationHandler;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class Test01 {

    @Test
    public void testProxy(){
        //创建目标类的对象
        UserDaoImpl userDao = new UserDaoImpl();
        //创建代理
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), new MyInvocationHandler(userDao));

        userDaoProxy.addUser();
    }

}
