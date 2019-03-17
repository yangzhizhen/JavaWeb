package com.monkey1024.dao;

import com.monkey1024.bean.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    List<User> selectUser();

    User selectUserById(int id);

    void deleteUser(int id);
}
