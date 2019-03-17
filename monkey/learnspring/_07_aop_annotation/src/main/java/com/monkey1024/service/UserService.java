package com.monkey1024.service;

public interface UserService {

    void addUser();

    void selectUserById(int id) throws Exception;

    int updateUser();

    void deleteUser();

    void selectUser();


}
