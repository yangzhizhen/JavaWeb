package com.monkey1024.service.impl;

import com.monkey1024.bean.User;
import com.monkey1024.dao.UserDao;
import com.monkey1024.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public void addUser(User user)  {

        userDao.addUser(user);

        int a = 1/0;

        //捕获异常之后，事务会失效
//        try {
//
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }

        //这不是一个运行时异常，只有当抛出运行时异常的时候，spring才会回滚事务
        //可以通过下面注解来标注需要回滚的异常
        //@Transactional(rollbackFor = {Exception.class,NullPointerException.class})
        //throw new Exception();
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public List<User> selectUser() {
        return userDao.selectUser();
    }

    @Override
    public User selectUserById(int id) {
        return userDao.selectUserById(id);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
