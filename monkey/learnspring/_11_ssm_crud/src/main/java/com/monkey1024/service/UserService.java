package com.monkey1024.service;

import com.monkey1024.bean.User;

import java.util.List;

public interface UserService {

    void addUser(User user) throws Exception;

    void updateUser(User user);

    List<User> selectUser();

    User selectUserById(int id);

    void deleteUser(int id);
}
